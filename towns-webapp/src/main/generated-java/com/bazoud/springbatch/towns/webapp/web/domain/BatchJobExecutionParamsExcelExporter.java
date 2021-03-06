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

import com.bazoud.springbatch.towns.webapp.domain.BatchJobExecutionParams;
import com.bazoud.springbatch.towns.webapp.web.domain.support.GenericExcelExporter;
import com.bazoud.springbatch.towns.webapp.web.faces.ConversationContextScoped;

/**
 * Exports to excel document {@link BatchJobExecutionParams} search criteria and result. 
 */
@Named
@ConversationContextScoped
public class BatchJobExecutionParamsExcelExporter extends GenericExcelExporter<BatchJobExecutionParams> {
    @Inject
    protected BatchJobExecutionParamsSearchForm sf;

    public BatchJobExecutionParamsExcelExporter() {
        super("batchJobExecutionParams_typeCd", "batchJobExecutionParams_keyName", "batchJobExecutionParams_stringVal", "batchJobExecutionParams_dateVal",
                "batchJobExecutionParams_longVal", "batchJobExecutionParams_doubleVal");
    }

    @Override
    protected void fillResultItem(int row, BatchJobExecutionParams item) {
        int col = 0;
        setValue(row, col++, item.getTypeCd());
        setValue(row, col++, item.getKeyName());
        setValue(row, col++, item.getStringVal());
        setDateTime(row, col++, item.getDateVal());
        setValue(row, col++, item.getLongVal());
        setValue(row, col++, item.getDoubleVal());
    }

    @Override
    public void fillSearchCriteria(int row) {
        useCriteriaSheet();

        setSelectedEntities(row++, 0, "batchJobExecutionParams_batchJobExecution", sf.getBatchJobExecutionSelector().getSelected());
        setSelector(row++, 0, "batchJobExecutionParams_typeCd", sf.getTypeCdSelector());
        setSelector(row++, 0, "batchJobExecutionParams_keyName", sf.getKeyNameSelector());
        setSelector(row++, 0, "batchJobExecutionParams_stringVal", sf.getStringValSelector());
        setRangeDateTime(row++, 0, "batchJobExecutionParams_dateVal", sf.getDateValRange());
        setRangeNumber(row++, 0, "batchJobExecutionParams_longVal", sf.getLongValRange());
        setRangeNumber(row++, 0, "batchJobExecutionParams_doubleVal", sf.getDoubleValRange());
        setSelector(row++, 0, "batchJobExecutionParams_identifying", sf.getIdentifyingSelector());
    }
}