/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-jsf2-spring-conversation:src/main/java/domain/ExcelExporter.e.vm.java
 */
package com.bazoud.springbatch.towns.webapp.web.domain;

import javax.inject.Inject;
import javax.inject.Named;

import com.bazoud.springbatch.towns.webapp.domain.BatchJobInstance;
import com.bazoud.springbatch.towns.webapp.web.domain.support.GenericExcelExporter;
import com.bazoud.springbatch.towns.webapp.web.faces.ConversationContextScoped;

/**
 * Exports to excel document {@link BatchJobInstance} search criteria and result. 
 */
@Named
@ConversationContextScoped
public class BatchJobInstanceExcelExporter extends GenericExcelExporter<BatchJobInstance> {
    @Inject
    protected BatchJobInstanceSearchForm sf;

    public BatchJobInstanceExcelExporter() {
        super("batchJobInstance_id", "batchJobInstance_jobName", "batchJobInstance_jobKey");
    }

    @Override
    protected void fillResultItem(int row, BatchJobInstance item) {
        int col = 0;
        setValue(row, col++, item.getId());
        setValue(row, col++, item.getJobName());
        setValue(row, col++, item.getJobKey());
    }

    @Override
    public void fillSearchCriteria(int row) {
        useCriteriaSheet();

        setLeftHeader(row, 0, "batchJobInstance_id");
        setValue(row++, 1, sf.getBatchJobInstance().getId());
        setSelector(row++, 0, "batchJobInstance_jobName", sf.getJobNameSelector());
        setSelector(row++, 0, "batchJobInstance_jobKey", sf.getJobKeySelector());
    }
}