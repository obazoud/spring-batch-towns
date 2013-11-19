package com.bazoud.springbatch.towns.batch.configuration.step;

import com.bazoud.springbatch.towns.batch.configuration.InfrastructureConfiguration;
import com.bazoud.springbatch.towns.batch.domain.Department;
import com.bazoud.springbatch.towns.batch.domain.Town;
import com.bazoud.springbatch.towns.batch.processor.DepartmentProcessor;
import com.google.common.collect.ImmutableMap;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.xml.StaxEventItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.oxm.xstream.XStreamMarshaller;

@Configuration
public class DepartmentStepConfiguration {
  @Autowired
  private StepBuilderFactory stepBuilders;

  @Autowired
  private InfrastructureConfiguration infrastructureConfiguration;

  @Bean(name = "departmentStep")
  public Step step() throws Exception {
    return stepBuilders.get("departmentStep")
        .<Department, Department>chunk(50)
        .reader(reader())
        .processor(processor())
        .writer(writer())
        .build();
  }

  @Bean(name = "departmentReader")
  public ItemReader<Department> reader() throws Exception {
    StaxEventItemReader<Department> reader = new StaxEventItemReader<Department>();
    reader.setResource(new FileSystemResource("/tmp/departments.xml"));
    reader.setFragmentRootElementName("department");
    reader.setUnmarshaller(marshaller());
    return reader;
  }

  @Bean(name = "departmentMarshaller")
  public XStreamMarshaller marshaller() throws Exception {
    XStreamMarshaller marshaller = new XStreamMarshaller();
    marshaller.setAliases(ImmutableMap.of("department", Department.class));
    marshaller.setAnnotatedClasses(Department.class);
    marshaller.setOmittedFields(ImmutableMap.<Class<?>, String>of(Department.class,
        "slug,name_soundex"));
    return marshaller;
  }

  @Bean(name = "departmentProcessor")
  public ItemProcessor<Department, Department> processor() {
    return new DepartmentProcessor();
  }

  @Bean(name = "departmentWriter")
  public ItemWriter<Department> writer() {
    JdbcBatchItemWriter<Department> itemWriter = new JdbcBatchItemWriter<Department>();
    itemWriter.setSql("INSERT INTO DEPARTMENT (ID, CODE, NAME, NAME_UPPERCASE)" +
        " VALUES (:id, :code, :name, :nameUpperCase)");
    itemWriter.setDataSource(infrastructureConfiguration.dataSource());
    itemWriter.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<Department>());
    return itemWriter;
  }

}
