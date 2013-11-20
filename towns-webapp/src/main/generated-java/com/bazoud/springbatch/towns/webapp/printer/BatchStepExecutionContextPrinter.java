/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-backend-jpa:src/main/java/printer/Printer.e.vm.java
 */
package com.bazoud.springbatch.towns.webapp.printer;

import java.util.Locale;

import javax.inject.Named;
import javax.inject.Singleton;

import com.bazoud.springbatch.towns.webapp.domain.BatchStepExecutionContext;
import com.bazoud.springbatch.towns.webapp.domain.BatchStepExecutionContext_;
import com.bazoud.springbatch.towns.webapp.printer.support.GenericPrinter;

/**
 * {@link GenericPrinter} for {@link BatchStepExecutionContext} 
 *
 * @see GenericPrinter
 * @see TypeAwarePrinter
 */
@Named
@Singleton
public class BatchStepExecutionContextPrinter extends GenericPrinter<BatchStepExecutionContext> {
    public BatchStepExecutionContextPrinter() {
        super(BatchStepExecutionContext.class, BatchStepExecutionContext_.shortContext);
    }

    @Override
    public String print(BatchStepExecutionContext batchStepExecutionContext, Locale locale) {
        if (batchStepExecutionContext == null) {
            return "";
        }
        StringBuilder ret = new StringBuilder();
        appendIfNotEmpty(ret, batchStepExecutionContext.getShortContext());
        return ret.toString();
    }
}