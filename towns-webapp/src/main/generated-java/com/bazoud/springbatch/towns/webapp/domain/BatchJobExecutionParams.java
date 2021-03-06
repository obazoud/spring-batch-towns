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
import javax.persistence.MapsId;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.validator.constraints.NotEmpty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bazoud.springbatch.towns.webapp.validation.FixedLength;
import com.google.common.base.Objects;

@Entity
@Table(name = "BATCH_JOB_EXECUTION_PARAMS")
public class BatchJobExecutionParams implements Identifiable<Long>, Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(BatchJobExecutionParams.class);

    // Raw attributes
    private Long id;
    private String typeCd;
    private String keyName;
    private String stringVal;
    private Date dateVal;
    private Long longVal;
    private Double doubleVal;
    private String identifying;

    // Many to one
    private BatchJobExecution batchJobExecution;

    // -- [id] ------------------------

    @Override
    @Column(name = "JOB_EXECUTION_ID", precision = 19)
    @Id
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public BatchJobExecutionParams id(Long id) {
        setId(id);
        return this;
    }

    @Override
    @Transient
    @XmlTransient
    public boolean isIdSet() {
        return id != null;
    }

    // -- [typeCd] ------------------------

    @NotEmpty
    @Size(max = 6)
    @Column(name = "TYPE_CD", nullable = false, length = 6)
    public String getTypeCd() {
        return typeCd;
    }

    public void setTypeCd(String typeCd) {
        this.typeCd = typeCd;
    }

    public BatchJobExecutionParams typeCd(String typeCd) {
        setTypeCd(typeCd);
        return this;
    }

    // -- [keyName] ------------------------

    @NotEmpty
    @Size(max = 100)
    @Column(name = "KEY_NAME", nullable = false, length = 100)
    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public BatchJobExecutionParams keyName(String keyName) {
        setKeyName(keyName);
        return this;
    }

    // -- [stringVal] ------------------------

    @Size(max = 250)
    @Column(name = "STRING_VAL", length = 250)
    public String getStringVal() {
        return stringVal;
    }

    public void setStringVal(String stringVal) {
        this.stringVal = stringVal;
    }

    public BatchJobExecutionParams stringVal(String stringVal) {
        setStringVal(stringVal);
        return this;
    }

    // -- [dateVal] ------------------------

    @Column(name = "DATE_VAL", length = 19)
    @Temporal(TIMESTAMP)
    public Date getDateVal() {
        return dateVal;
    }

    public void setDateVal(Date dateVal) {
        this.dateVal = dateVal;
    }

    public BatchJobExecutionParams dateVal(Date dateVal) {
        setDateVal(dateVal);
        return this;
    }

    // -- [longVal] ------------------------

    @Digits(integer = 19, fraction = 0)
    @Column(name = "LONG_VAL", precision = 19)
    public Long getLongVal() {
        return longVal;
    }

    public void setLongVal(Long longVal) {
        this.longVal = longVal;
    }

    public BatchJobExecutionParams longVal(Long longVal) {
        setLongVal(longVal);
        return this;
    }

    // -- [doubleVal] ------------------------

    @Digits(integer = 22, fraction = 0)
    @Column(name = "DOUBLE_VAL", precision = 22)
    public Double getDoubleVal() {
        return doubleVal;
    }

    public void setDoubleVal(Double doubleVal) {
        this.doubleVal = doubleVal;
    }

    public BatchJobExecutionParams doubleVal(Double doubleVal) {
        setDoubleVal(doubleVal);
        return this;
    }

    // -- [identifying] ------------------------

    @FixedLength(length = 1, nullable = false)
    @NotEmpty
    @Column(name = "IDENTIFYING", nullable = false, length = 1)
    public String getIdentifying() {
        return identifying;
    }

    public void setIdentifying(String identifying) {
        this.identifying = identifying;
    }

    public BatchJobExecutionParams identifying(String identifying) {
        setIdentifying(identifying);
        return this;
    }

    // -----------------------------------------------------------------
    // Many to One support
    // -----------------------------------------------------------------

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: BatchJobExecutionParams.batchJobExecution ==> BatchJobExecution.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @JoinColumn(name = "JOB_EXECUTION_ID", nullable = false)
    @ManyToOne(cascade = { PERSIST, MERGE }, fetch = LAZY)
    @MapsId
    public BatchJobExecution getBatchJobExecution() {
        return batchJobExecution;
    }

    /**
     * Set the {@link #batchJobExecution} without adding this BatchJobExecutionParams instance on the passed {@link #batchJobExecution}
     */
    public void setBatchJobExecution(BatchJobExecution batchJobExecution) {
        this.batchJobExecution = batchJobExecution;
    }

    public BatchJobExecutionParams batchJobExecution(BatchJobExecution batchJobExecution) {
        setBatchJobExecution(batchJobExecution);
        return this;
    }

    /**
     * Apply the default values.
     */
    public BatchJobExecutionParams withDefaults() {
        return this;
    }

    /**
     * Equals implementation using a business key.
     */
    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof BatchJobExecutionParams && hashCode() == other.hashCode());
    }

    private IdentifiableHashBuilder identifiableHashBuilder = new IdentifiableHashBuilder();

    @Override
    public int hashCode() {
        return identifiableHashBuilder.hash(log, this);
    }

    /**
     * Construct a readable string representation for this BatchJobExecutionParams instance.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return Objects.toStringHelper(this) //
                .add("id", getId()) //
                .add("typeCd", getTypeCd()) //
                .add("keyName", getKeyName()) //
                .add("stringVal", getStringVal()) //
                .add("dateVal", getDateVal()) //
                .add("longVal", getLongVal()) //
                .add("doubleVal", getDoubleVal()) //
                .add("identifying", getIdentifying()) //
                .toString();
    }
}