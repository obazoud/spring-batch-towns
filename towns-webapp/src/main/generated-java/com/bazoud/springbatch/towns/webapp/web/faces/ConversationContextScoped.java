/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-jsf2-spring-conversation:src/main/java/faces/ConversationContextScoped.p.vm.java
 */
package com.bazoud.springbatch.towns.webapp.web.faces;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.springframework.context.annotation.Scope;

/**
 * Beans in the 'conversationContext' scope reside in a {@link Conversation conversation}'s {@link ConversationContext}.
 * They are 'visible' only when the conversation is bound to the current thread of execution and their 
 * hosting ConversationContext is on top of the conversation's contextes stack.
 */
@Scope("conversationContext")
@Retention(RetentionPolicy.RUNTIME)
public @interface ConversationContextScoped {
}
