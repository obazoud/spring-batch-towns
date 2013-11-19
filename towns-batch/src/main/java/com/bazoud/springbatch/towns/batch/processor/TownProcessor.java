package com.bazoud.springbatch.towns.batch.processor;

import com.bazoud.springbatch.towns.batch.domain.Town;
import org.springframework.batch.item.ItemProcessor;

public class TownProcessor implements ItemProcessor<Town, Town> {
  @Override
  public Town process(Town town) throws Exception {
    return town;
  }
}
