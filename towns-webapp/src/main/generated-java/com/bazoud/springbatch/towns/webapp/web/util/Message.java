/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-jsf2-spring-conversation:src/main/java/util/Message.p.vm.java
 */
package com.bazoud.springbatch.towns.webapp.web.util;

import javax.faces.application.FacesMessage;

/**
 * Integration _HACK_ : would be nice if jsf was providing the id...
 * Wrap {@link FacesMessage} along with the id of the associated component.
 */
public class Message {

    private String sourceId;
    private FacesMessage facesMessage;

    public Message(String sourceId, FacesMessage facesMessage) {
        this.sourceId = sourceId;
        this.facesMessage = facesMessage;
    }

    public String getSourceId() {
        return sourceId;
    }

    public FacesMessage getFacesMessage() {
        return facesMessage;
    }

    public String getSeverity() {
        return MessageUtil.toCssFriendly(facesMessage.getSeverity());
    }
}