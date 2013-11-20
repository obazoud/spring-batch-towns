/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-backend-jpa:src/main/java/domain/Entity.e.vm.java
 */
package com.bazoud.springbatch.towns.webapp.domain;

import static javax.persistence.CascadeType.MERGE;
import static javax.persistence.CascadeType.PERSIST;
import static javax.persistence.FetchType.LAZY;
import static javax.persistence.TemporalType.TIMESTAMP;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;
import javax.persistence.Version;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Objects;

@Entity
@Table(name = "BATCH_JOB_EXECUTION")
public class BatchJobExecution implements Identifiable<Long>, Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(BatchJobExecution.class);

    // Raw attributes
    private Long id;
    private Long version;
    private Date createTime;
    private Date startTime;
    private Date endTime;
    private String status;
    private String exitCode;
    private String exitMessage;
    private Date lastUpdated;

    // Many to one
    private BatchJobInstance jobInstance;

    // -- [id] ------------------------

    @Override
    @Digits(integer = 19, fraction = 0)
    @NotNull
    @Column(name = "JOB_EXECUTION_ID", precision = 19)
    @Id
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public BatchJobExecution id(Long id) {
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

    public BatchJobExecution version(Long version) {
        setVersion(version);
        return this;
    }

    // -- [createTime] ------------------------

    @NotNull
    @Column(name = "CREATE_TIME", nullable = false, length = 19)
    @Temporal(TIMESTAMP)
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public BatchJobExecution createTime(Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    // -- [startTime] ------------------------

    @Column(name = "START_TIME", length = 19)
    @Temporal(TIMESTAMP)
    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public BatchJobExecution startTime(Date startTime) {
        setStartTime(startTime);
        return this;
    }

    // -- [endTime] ------------------------

    @Column(name = "END_TIME", length = 19)
    @Temporal(TIMESTAMP)
    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public BatchJobExecution endTime(Date endTime) {
        setEndTime(endTime);
        return this;
    }

    // -- [status] ------------------------

    @Size(max = 10)
    @Column(name = "STATUS", length = 10)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BatchJobExecution status(String status) {
        setStatus(status);
        return this;
    }

    // -- [exitCode] ------------------------

    @Size(max = 100)
    @Column(name = "EXIT_CODE", length = 100)
    public String getExitCode() {
        return exitCode;
    }

    public void setExitCode(String exitCode) {
        this.exitCode = exitCode;
    }

    public BatchJobExecution exitCode(String exitCode) {
        setExitCode(exitCode);
        return this;
    }

    // -- [exitMessage] ------------------------

    @Size(max = 2500)
    @Column(name = "EXIT_MESSAGE", length = 2500)
    public String getExitMessage() {
        return exitMessage;
    }

    public void setExitMessage(String exitMessage) {
        this.exitMessage = exitMessage;
    }

    public BatchJobExecution exitMessage(String exitMessage) {
        setExitMessage(exitMessage);
        return this;
    }

    // -- [lastUpdated] ------------------------

    @Column(name = "LAST_UPDATED", length = 19)
    @Temporal(TIMESTAMP)
    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public BatchJobExecution lastUpdated(Date lastUpdated) {
        setLastUpdated(lastUpdated);
        return this;
    }

    // -----------------------------------------------------------------
    // Many to One support
    // -----------------------------------------------------------------

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: BatchJobExecution.jobInstance ==> BatchJobInstance.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @NotNull
    @JoinColumn(name = "JOB_INSTANCE_ID", nullable = false)
    @ManyToOne(cascade = { PERSIST, MERGE }, fetch = LAZY)
    public BatchJobInstance getJobInstance() {
        return jobInstance;
    }

    /**
     * Set the {@link #jobInstance} without adding this BatchJobExecution instance on the passed {@link #jobInstance}
     */
    public void setJobInstance(BatchJobInstance jobInstance) {
        this.jobInstance = jobInstance;
    }

    public BatchJobExecution jobInstance(BatchJobInstance jobInstance) {
        setJobInstance(jobInstance);
        return this;
    }

    /**
     * Apply the default values.
     */
    public BatchJobExecution withDefaults() {
        return this;
    }

    /**
     * Equals implementation using a business key.
     */
    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof BatchJobExecution && hashCode() == other.hashCode());
    }

    private IdentifiableHashBuilder identifiableHashBuilder = new IdentifiableHashBuilder();

    @Override
    public int hashCode() {
        return identifiableHashBuilder.hash(log, this);
    }

    /**
     * Construct a readable string representation for this BatchJobExecution instance.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return Objects.toStringHelper(this) //
                .add("id", getId()) //
                .add("version", getVersion()) //
                .add("createTime", getCreateTime()) //
                .add("startTime", getStartTime()) //
                .add("endTime", getEndTime()) //
                .add("status", getStatus()) //
                .add("exitCode", getExitCode()) //
                .add("exitMessage", getExitMessage()) //
                .add("lastUpdated", getLastUpdated()) //
                .toString();
    }
}