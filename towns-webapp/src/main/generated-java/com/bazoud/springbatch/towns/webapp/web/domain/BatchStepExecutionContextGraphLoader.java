/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-jsf2-spring-conversation:src/main/java/domain/GraphLoader.e.vm.java
 */
package com.bazoud.springbatch.towns.webapp.web.domain;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import com.bazoud.springbatch.towns.webapp.domain.BatchStepExecutionContext;
import com.bazoud.springbatch.towns.webapp.repository.BatchStepExecutionContextRepository;
import com.bazoud.springbatch.towns.webapp.repository.support.EntityGraphLoader;

/**
 * Preloads the {@link BatchStepExecutionContext} associations required by the view layer.
 * 
 * Do not use other GraphLoaders in this GraphLoader. 
 */
@Named
@Singleton
public class BatchStepExecutionContextGraphLoader extends EntityGraphLoader<BatchStepExecutionContext, Long> {
    // required by cglib to create a proxy around the object as we are using the @Transactional annotation
    protected BatchStepExecutionContextGraphLoader() {
        super();
    }

    @Inject
    public BatchStepExecutionContextGraphLoader(BatchStepExecutionContextRepository batchStepExecutionContextRepository) {
        super(batchStepExecutionContextRepository);
    }

    @Override
    public void loadGraph(BatchStepExecutionContext batchStepExecutionContext) {
        loadSingular(batchStepExecutionContext.getBatchStepExecution());
    }
}