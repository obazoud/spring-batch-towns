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

import com.bazoud.springbatch.towns.webapp.domain.Department;
import com.bazoud.springbatch.towns.webapp.repository.DepartmentRepository;
import com.bazoud.springbatch.towns.webapp.web.domain.support.GenericEditForm;
import com.bazoud.springbatch.towns.webapp.web.faces.ConversationContextScoped;

/**
 * View Helper/Controller to edit {@link Department}.
 */
@Named
@ConversationContextScoped
public class DepartmentEditForm extends GenericEditForm<Department, Integer> {
    @Inject
    protected DepartmentController departmentController;

    @Inject
    public DepartmentEditForm(DepartmentRepository departmentRepository) {
        super(departmentRepository);
    }

    /**
     * The entity to edit/view.
     */
    public Department getDepartment() {
        return getEntity();
    }

    public String print() {
        return departmentController.print(getDepartment());
    }
}