/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-jsf2-spring-conversation:src/main/java/faces/ConversationAwareElResolver.p.vm.java
 */
package com.bazoud.springbatch.towns.webapp.web.faces;

import static com.bazoud.springbatch.towns.webapp.web.conversation.ConversationHolder.getCurrentConversation;

import javax.el.ELContext;
import javax.el.ELException;

import org.springframework.web.jsf.el.SpringBeanFacesELResolver;

import com.bazoud.springbatch.towns.webapp.web.conversation.Conversation;

/**
 * ConversationAwareElResolver is declared in faces-config.xml.
 * It tries to find values in the current {@link ConversationContext}. 
 */
public class ConversationAwareElResolver extends SpringBeanFacesELResolver {

    @Override
    public Object getValue(ELContext elContext, Object base, Object property) throws ELException {
        if (base == null && property != null) {
            Conversation currentConversation = getCurrentConversation();
            if (currentConversation != null) {
                Object result = currentConversation.getVar(property.toString());
                if (result != null) {
                    elContext.setPropertyResolved(true);
                    return result;
                }
            }
        }

        return super.getValue(elContext, base, property);
    }

    @Override
    public Class<?> getType(ELContext elContext, Object base, Object property) throws ELException {
        if (base == null && property != null) {
            Conversation currentConversation = getCurrentConversation();
            if (currentConversation != null) {
                Object value = currentConversation.getVar(property.toString());
                if (value != null) {
                    elContext.setPropertyResolved(true);
                    return value.getClass();
                }
            }
        }

        return super.getType(elContext, base, property);
    }
}
