/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-jsf2-spring-conversation:src/main/java/conversation/UnexpectedConversationException.p.vm.java
 */
package com.bazoud.springbatch.towns.webapp.web.conversation;

/**
 * Exception thrown when the end user requests an unexpected URL, that is an URL which is out of sync with the current conversation.
 */
public class UnexpectedConversationException extends Exception {
    private static final long serialVersionUID = 1L;
    private final String redirectUrl;

    public UnexpectedConversationException(String reason, String unexpectedUrl, String redirectUrl) {
        super(reason + ". requested url: " + unexpectedUrl + " => we redirect her to " + redirectUrl);
        this.redirectUrl = redirectUrl;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }
}