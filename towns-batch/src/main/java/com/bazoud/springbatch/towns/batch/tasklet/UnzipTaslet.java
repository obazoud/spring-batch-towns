package com.bazoud.springbatch.towns.batch.tasklet;

import org.springframework.batch.core.step.tasklet.SystemCommandTasklet;
import org.springframework.core.io.ClassPathResource;

public class UnzipTaslet extends SystemCommandTasklet {

  @Override
  public void afterPropertiesSet() throws Exception {
    this.setCommand("/usr/bin/unzip -o " + new ClassPathResource("towns.zip").getFile().getAbsolutePath());
    this.setTimeout(60000L);
    this.setWorkingDirectory("/tmp");
    super.afterPropertiesSet();
  }
}
