/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-backend-jpa:src/main/java/domain/Entity.e.vm.java
 */
package com.bazoud.springbatch.towns.webapp.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.validator.constraints.NotEmpty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Objects;

@Entity
@Table(name = "BATCH_JOB_INSTANCE", uniqueConstraints = { @UniqueConstraint(name = "JOB_INST_UN", columnNames = { "JOB_NAME", "JOB_KEY" }) })
public class BatchJobInstance implements Identifiable<Long>, Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(BatchJobInstance.class);

    // Raw attributes
    private Long id;
    private Long version;
    private String jobName;
    private String jobKey;

    // -- [id] ------------------------

    @Override
    @Digits(integer = 19, fraction = 0)
    @NotNull
    @Column(name = "JOB_INSTANCE_ID", precision = 19)
    @Id
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public BatchJobInstance id(Long id) {
        setId(id);
        return this;
    }

    @Override
    @Transient
    @XmlTransient
    public boolean isIdSet() {
        return id != null;
    }

    // -- [version] ------------------------

    @Column(name = "VERSION", precision = 19)
    @Version
    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public BatchJobInstance version(Long version) {
        setVersion(version);
        return this;
    }

    // -- [jobName] ------------------------

    @NotEmpty
    @Size(max = 100)
    @Column(name = "JOB_NAME", nullable = false, length = 100)
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public BatchJobInstance jobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    // -- [jobKey] ------------------------

    @NotEmpty
    @Size(max = 32)
    @Column(name = "JOB_KEY", nullable = false, length = 32)
    public String getJobKey() {
        return jobKey;
    }

    public void setJobKey(String jobKey) {
        this.jobKey = jobKey;
    }

    public BatchJobInstance jobKey(String jobKey) {
        setJobKey(jobKey);
        return this;
    }

    /**
     * Apply the default values.
     */
    public BatchJobInstance withDefaults() {
        return this;
    }

    /**
     * Equals implementation using a business key.
     */
    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof BatchJobInstance && hashCode() == other.hashCode());
    }

    private volatile int previousHashCode = 0;

    @Override
    public int hashCode() {
        int hashCode = Objects.hashCode(getJobName(), //
                getJobKey());

        if (previousHashCode != 0 && previousHashCode != hashCode) {
            log.warn("DEVELOPER: hashCode has changed!." //
                    + "If you encounter this message you should take the time to carefuly review equals/hashCode for: " //
                    + getClass().getCanonicalName());
        }

        previousHashCode = hashCode;
        return hashCode;
    }

    /**
     * Construct a readable string representation for this BatchJobInstance instance.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return Objects.toStringHelper(this) //
                .add("id", getId()) //
                .add("version", getVersion()) //
                .add("jobName", getJobName()) //
                .add("jobKey", getJobKey()) //
                .toString();
    }
}