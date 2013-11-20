package com.bazoud.springbatch.towns.batch;

import com.bazoud.springbatch.towns.batch.configuration.StandaloneInfrastructureConfiguration;
import com.bazoud.springbatch.towns.batch.configuration.TestInfrastructureConfiguration;
import com.bazoud.springbatch.towns.batch.configuration.TownJobConfiguration;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.*;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@ContextConfiguration(classes = {TestInfrastructureConfiguration.class, StandaloneInfrastructureConfiguration.class, TownJobConfiguration.class})
@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("test")
public class JobTests {
  @Autowired
  private JobLauncher jobLauncher;

  @Autowired
  private Job job;

  @Autowired
  private DataSource dataSource;

  private JdbcTemplate jdbcTemplate;

  @Before
  public void setup() {
    jdbcTemplate = new JdbcTemplate(dataSource);
  }

  @Test
  public void testLaunchJob() throws Exception {
    JobParameters jobParameters = new JobParametersBuilder()
        .addString("pathToFile", "import.zip")
        .toJobParameters();
    JobExecution jobExecution = jobLauncher.run(job, jobParameters);
    assertThat(jobExecution.getExitStatus().getExitCode(), is(ExitStatus.COMPLETED.getExitCode()));
    assertThat(jdbcTemplate.queryForObject("select count(*) from DEPARTMENT", Integer.class), is(101));
    assertThat(jdbcTemplate.queryForObject("select count(*) from TOWN", Integer.class), is(36568));
  }
}
