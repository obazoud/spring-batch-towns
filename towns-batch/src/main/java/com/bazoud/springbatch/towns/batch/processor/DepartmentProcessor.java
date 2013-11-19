package com.bazoud.springbatch.towns.batch.processor;

import com.bazoud.springbatch.towns.batch.domain.Department;
import org.springframework.batch.item.ItemProcessor;

public class DepartmentProcessor implements ItemProcessor<Department, Department> {

  @Override
  public Department process(Department department) throws Exception {
    return department;
  }
}
