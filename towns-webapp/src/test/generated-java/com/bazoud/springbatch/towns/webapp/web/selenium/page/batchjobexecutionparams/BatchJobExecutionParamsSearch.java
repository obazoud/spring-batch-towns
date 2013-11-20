/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-selenium-primefaces:src/test/java/selenium/pages/entity/SearchPage.e.vm.java
 */
package com.bazoud.springbatch.towns.webapp.web.selenium.page.batchjobexecutionparams;

import com.bazoud.springbatch.towns.webapp.web.selenium.support.Page;
import com.bazoud.springbatch.towns.webapp.web.selenium.support.elements.Autocomplete;
import com.bazoud.springbatch.towns.webapp.web.selenium.support.elements.CustomWebElement;
import com.bazoud.springbatch.towns.webapp.web.selenium.support.elements.EntityAction;
import com.bazoud.springbatch.towns.webapp.web.selenium.support.elements.Messages;
import com.bazoud.springbatch.towns.webapp.web.selenium.support.elements.OrderBy;
import com.bazoud.springbatch.towns.webapp.web.selenium.support.elements.SearchForm;
import com.bazoud.springbatch.towns.webapp.web.selenium.support.elements.StringRange;
import com.bazoud.springbatch.towns.webapp.web.selenium.support.elements.Table;

@Page
public class BatchJobExecutionParamsSearch {
    public Table table;
    public EntityAction entity;
    public Messages messages;
    public BatchJobExecutionParamsSearchOrders orders;
    public BatchJobExecutionParamsSearchForm form;

    public static class BatchJobExecutionParamsSearchOrders extends CustomWebElement {
        public OrderBy id = new OrderBy("batchJobExecutionParams_id");
        public OrderBy typeCd = new OrderBy("batchJobExecutionParams_typeCd");
        public OrderBy keyName = new OrderBy("batchJobExecutionParams_keyName");
        public OrderBy stringVal = new OrderBy("batchJobExecutionParams_stringVal");
        public OrderBy dateVal = new OrderBy("batchJobExecutionParams_dateVal");
        public OrderBy longVal = new OrderBy("batchJobExecutionParams_longVal");
        public OrderBy doubleVal = new OrderBy("batchJobExecutionParams_doubleVal");
        public OrderBy identifying = new OrderBy("batchJobExecutionParams_identifying");
    }

    public static class BatchJobExecutionParamsSearchForm extends SearchForm {
        public Autocomplete typeCd = new Autocomplete("form:typeCd");
        public Autocomplete keyName = new Autocomplete("form:keyName");
        public Autocomplete stringVal = new Autocomplete("form:stringVal");
        public StringRange dateVal = new StringRange("form:dateVal");
        public StringRange longVal = new StringRange("form:longVal");
        public StringRange doubleVal = new StringRange("form:doubleVal");
        public Autocomplete identifying = new Autocomplete("form:identifying");
        public Autocomplete batchJobExecution = new Autocomplete("form:batchJobExecutionSelector");
    }
}