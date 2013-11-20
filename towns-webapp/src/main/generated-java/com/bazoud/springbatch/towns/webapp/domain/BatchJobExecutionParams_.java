/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-backend-jpa:src/main/java/domain/EntityMeta_.e.vm.java
 */
package com.bazoud.springbatch.towns.webapp.domain;

import java.util.Date;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(BatchJobExecutionParams.class)
public abstract class BatchJobExecutionParams_ {

    // Raw attributes
    public static volatile SingularAttribute<BatchJobExecutionParams, Long> id;
    public static volatile SingularAttribute<BatchJobExecutionParams, String> typeCd;
    public static volatile SingularAttribute<BatchJobExecutionParams, String> keyName;
    public static volatile SingularAttribute<BatchJobExecutionParams, String> stringVal;
    public static volatile SingularAttribute<BatchJobExecutionParams, Date> dateVal;
    public static volatile SingularAttribute<BatchJobExecutionParams, Long> longVal;
    public static volatile SingularAttribute<BatchJobExecutionParams, Double> doubleVal;
    public static volatile SingularAttribute<BatchJobExecutionParams, String> identifying;

    // Many to one
    public static volatile SingularAttribute<BatchJobExecutionParams, BatchJobExecution> batchJobExecution;
}