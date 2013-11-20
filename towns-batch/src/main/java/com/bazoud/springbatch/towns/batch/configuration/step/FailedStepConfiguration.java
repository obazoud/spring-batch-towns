package com.bazoud.springbatch.towns.batch.configuration.step;

import com.bazoud.springbatch.towns.batch.tasklet.FailedTaslet;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FailedStepConfiguration {
  @Autowired
  private StepBuilderFactory stepBuilders;

  @Bean(name = "failedStep")
  public Step step() throws Exception {
    return stepBuilders.get("failedStep")
        .tasklet(tasklet())
        .build();
  }

  @Bean(name = "failedTasklet")
  public Tasklet tasklet() {
    FailedTaslet taslet = new FailedTaslet();
    return taslet;
  }

}
