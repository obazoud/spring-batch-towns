/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-jsf2-spring-conversation:src/main/java/domain/EditForm.e.vm.java
 */
package com.bazoud.springbatch.towns.webapp.web.domain;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.constraints.NotNull;

import com.bazoud.springbatch.towns.webapp.domain.BatchJobExecution;
import com.bazoud.springbatch.towns.webapp.domain.BatchStepExecution;
import com.bazoud.springbatch.towns.webapp.domain.BatchStepExecution_;
import com.bazoud.springbatch.towns.webapp.repository.BatchStepExecutionRepository;
import com.bazoud.springbatch.towns.webapp.web.domain.support.GenericEditForm;
import com.bazoud.springbatch.towns.webapp.web.domain.support.GenericToOneAssociation;
import com.bazoud.springbatch.towns.webapp.web.faces.ConversationContextScoped;

/**
 * View Helper/Controller to edit {@link BatchStepExecution}.
 */
@Named
@ConversationContextScoped
public class BatchStepExecutionEditForm extends GenericEditForm<BatchStepExecution, Long> {
    @Inject
    protected BatchStepExecutionController batchStepExecutionController;
    @Inject
    protected BatchJobExecutionController batchJobExecutionController;
    protected GenericToOneAssociation<BatchJobExecution, Long> jobExecution;

    @Inject
    public BatchStepExecutionEditForm(BatchStepExecutionRepository batchStepExecutionRepository, BatchStepExecutionGraphLoader batchStepExecutionGraphLoader) {
        super(batchStepExecutionRepository, batchStepExecutionGraphLoader);
    }

    /**
     * The entity to edit/view.
     */
    public BatchStepExecution getBatchStepExecution() {
        return getEntity();
    }

    public String print() {
        return batchStepExecutionController.print(getBatchStepExecution());
    }

    @PostConstruct
    void setupJobExecutionActions() {
        jobExecution = new GenericToOneAssociation<BatchJobExecution, Long>(batchJobExecutionController, BatchStepExecution_.jobExecution) {
            @Override
            protected BatchJobExecution get() {
                return getBatchStepExecution().getJobExecution();
            }

            @Override
            protected void set(BatchJobExecution batchJobExecution) {
                getBatchStepExecution().setJobExecution(batchJobExecution);
            }

            @NotNull
            @Override
            public BatchJobExecution getSelected() {
                return super.getSelected();
            }
        };
    }

    public GenericToOneAssociation<BatchJobExecution, Long> getJobExecution() {
        return jobExecution;
    }
}
