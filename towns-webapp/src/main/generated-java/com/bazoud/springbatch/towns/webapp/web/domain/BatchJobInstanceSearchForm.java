/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-jsf2-spring-conversation:src/main/java/domain/SearchForm.e.vm.java
 */
package com.bazoud.springbatch.towns.webapp.web.domain;

import static com.bazoud.springbatch.towns.webapp.repository.support.PropertySelector.newPropertySelector;

import javax.inject.Named;

import com.bazoud.springbatch.towns.webapp.domain.BatchJobInstance;
import com.bazoud.springbatch.towns.webapp.domain.BatchJobInstance_;
import com.bazoud.springbatch.towns.webapp.repository.support.PropertySelector;
import com.bazoud.springbatch.towns.webapp.repository.support.SearchParameters;
import com.bazoud.springbatch.towns.webapp.web.domain.support.GenericSearchForm;
import com.bazoud.springbatch.towns.webapp.web.faces.ConversationContextScoped;

/**
 * View Helper to search {@link BatchJobInstance}.
 * It exposes a {@link BatchJobInstance} instance so it can be used in search by-example-query.
 */
@Named
@ConversationContextScoped
public class BatchJobInstanceSearchForm extends GenericSearchForm<BatchJobInstance, Long, BatchJobInstanceSearchForm> {
    private static final long serialVersionUID = 1L;
    protected BatchJobInstance batchJobInstance = new BatchJobInstance();
    protected PropertySelector<BatchJobInstance, Long> idSelector = newPropertySelector(BatchJobInstance_.id);
    protected PropertySelector<BatchJobInstance, String> jobNameSelector = newPropertySelector(BatchJobInstance_.jobName);
    protected PropertySelector<BatchJobInstance, String> jobKeySelector = newPropertySelector(BatchJobInstance_.jobKey);

    public BatchJobInstance getBatchJobInstance() {
        return batchJobInstance;
    }

    @Override
    protected BatchJobInstance getEntity() {
        return getBatchJobInstance();
    }

    @Override
    public BatchJobInstanceSearchForm newInstance() {
        return new BatchJobInstanceSearchForm();
    }

    @Override
    public SearchParameters toSearchParameters() {
        SearchParameters sp = searchParameters();
        sp.property(idSelector, jobNameSelector, jobKeySelector);
        return sp;
    }

    @Override
    public void resetWithOther(BatchJobInstanceSearchForm other) {
        this.batchJobInstance = other.getBatchJobInstance();
        this.idSelector = other.getIdSelector();
        this.jobNameSelector = other.getJobNameSelector();
        this.jobKeySelector = other.getJobKeySelector();
    }

    // Property selectors
    public PropertySelector<BatchJobInstance, Long> getIdSelector() {
        return idSelector;
    }

    public PropertySelector<BatchJobInstance, String> getJobNameSelector() {
        return jobNameSelector;
    }

    public PropertySelector<BatchJobInstance, String> getJobKeySelector() {
        return jobKeySelector;
    }
}
