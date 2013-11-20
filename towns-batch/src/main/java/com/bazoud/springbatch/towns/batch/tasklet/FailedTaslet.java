package com.bazoud.springbatch.towns.batch.tasklet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class FailedTaslet implements Tasklet {
  private static final Logger LOG = LoggerFactory.getLogger(FailedTaslet.class);

  @Override
  public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
    LOG.warn("" +
        "\n                \n" +
        "\n     FAIL WHALE!\n" +
        "\n" +
        "W     W      W        \n" +
        "W        W  W     W    \n" +
        "              '.  W      \n" +
        "  .-\"\"-._     \\ \\.--|  \n" +
        " /       \"-..__) .-'   \n" +
        "|     _         /      \n" +
        "\\'-.__,   .__.,'       \n" +
        " `'----'._\\--'      \n" +
        "VVVVVVVVVVVVVVVVVVVVV" +
        "\n                \n" +
        "");
    return RepeatStatus.FINISHED;
  }
}
