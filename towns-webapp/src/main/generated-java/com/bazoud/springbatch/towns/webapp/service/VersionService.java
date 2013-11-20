/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-backend-jpa:src/main/java/service/VersionService.p.vm.java
 */
package com.bazoud.springbatch.towns.webapp.service;

import static org.apache.commons.lang.StringUtils.endsWithIgnoreCase;
import static org.apache.commons.lang.StringUtils.equalsIgnoreCase;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;

@Named
public class VersionService {

    private static final String NO_SVN_REVISION = "noSVNRevision";

    @Value("${build.version:}")
    private String version;

    @Value("${build.svnrevision:}")
    private String svnrevision;

    public String format() {
        if (endsWithIgnoreCase(version, "SNAPSHOT") && !equalsIgnoreCase(svnrevision, NO_SVN_REVISION)) {
            return version + " (rev" + svnrevision + ")";
        }
        return version;
    }

    public String getVersion() {
        return version;
    }

    public String getSvnrevision() {
        return svnrevision;
    }
}
