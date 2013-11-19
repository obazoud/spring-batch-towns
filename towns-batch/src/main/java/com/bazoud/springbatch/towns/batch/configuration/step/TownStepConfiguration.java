package com.bazoud.springbatch.towns.batch.configuration.step;

import com.bazoud.springbatch.towns.batch.configuration.InfrastructureConfiguration;
import com.bazoud.springbatch.towns.batch.domain.Town;
import com.bazoud.springbatch.towns.batch.processor.TownProcessor;
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
public class TownStepConfiguration {
  @Autowired
  private StepBuilderFactory stepBuilders;

  @Autowired
  private InfrastructureConfiguration infrastructureConfiguration;

  @Bean(name = "townStep")
  public Step step() throws Exception {
    return stepBuilders.get("townStep")
        .<Town, Town>chunk(3000)
        .reader(reader())
        .processor(processor())
        .writer(writer())
        .build();
  }

  @Bean(name = "townReader")
  public ItemReader<Town> reader() throws Exception {
    StaxEventItemReader<Town> reader = new StaxEventItemReader<Town>();
    reader.setResource(new FileSystemResource("/tmp/towns.xml"));
    reader.setFragmentRootElementName("town");
    reader.setUnmarshaller(marshaller());
    return reader;
  }

  @Bean(name = "townMarshaller")
  public XStreamMarshaller marshaller() throws Exception {
    XStreamMarshaller marshaller = new XStreamMarshaller();
    marshaller.setAliases(ImmutableMap.of("town", Town.class));
    marshaller.setAnnotatedClasses(Town.class);
    marshaller.setOmittedFields(ImmutableMap.<Class<?>, String>of(Town.class,
        "name_soundex,name_metaphone,commune,code_commune,arrondissement,canton,amdi,surface"));
    return marshaller;
  }

  @Bean(name = "townProcessor")
  public ItemProcessor<Town, Town> processor() {
    return new TownProcessor();
  }

  @Bean(name = "townWriter")
  public ItemWriter<Town> writer() {
    JdbcBatchItemWriter<Town> itemWriter = new JdbcBatchItemWriter<>();
    itemWriter.setSql(
            "INSERT INTO TOWN(" +
                " ID, DEPARTMENT, NAME, NAME_REAL, POSTCODE, POPULATION, AREA, " +
                " LONGITUDE_DEG, LATITUDE_DEG, LONGITUDE_GRD, LATITUDE_GRD, " +
                " LONGITUDE_DMS, LATITUDE_DMS, " +
                " ZMIN, ZMAX) " +
                "VALUES (" +
                ":id,:department,:name,:nameReal,:postCode,:population,:area," +
                ":longitudeDeg,:latitudeDeg,:longitudeGrd,:latitudeGrd,:longitudeDms,:latitudeDms," +
                ":zmin,:zmax)"
    );
    itemWriter.setDataSource(infrastructureConfiguration.dataSource());
    itemWriter.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<Town>());
    return itemWriter;
  }

}
