/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-jsf2-spring-conversation:src/main/java/domain/EditForm.e.vm.java
 */
package com.bazoud.springbatch.towns.webapp.web.domain;

import javax.inject.Inject;
import javax.inject.Named;

import com.bazoud.springbatch.towns.webapp.domain.BatchStepExecutionSeq;
import com.bazoud.springbatch.towns.webapp.repository.BatchStepExecutionSeqRepository;
import com.bazoud.springbatch.towns.webapp.web.domain.support.GenericEditForm;
import com.bazoud.springbatch.towns.webapp.web.faces.ConversationContextScoped;

/**
 * View Helper/Controller to edit {@link BatchStepExecutionSeq}.
 */
@Named
@ConversationContextScoped
public class BatchStepExecutionSeqEditForm extends GenericEditForm<BatchStepExecutionSeq, Long> {
    @Inject
    protected BatchStepExecutionSeqController batchStepExecutionSeqController;

    @Inject
    public BatchStepExecutionSeqEditForm(BatchStepExecutionSeqRepository batchStepExecutionSeqRepository) {
        super(batchStepExecutionSeqRepository);
    }

    /**
     * The entity to edit/view.
     */
    public BatchStepExecutionSeq getBatchStepExecutionSeq() {
        return getEntity();
    }

    public String print() {
        return batchStepExecutionSeqController.print(getBatchStepExecutionSeq());
    }
}
