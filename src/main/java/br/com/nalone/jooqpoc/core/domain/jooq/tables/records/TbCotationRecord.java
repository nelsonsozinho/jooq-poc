/*
 * This file is generated by jOOQ.
*/
package br.com.nalone.jooqpoc.core.domain.jooq.tables.records;


import br.com.nalone.jooqpoc.core.domain.jooq.tables.TbCotation;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TbCotationRecord extends UpdatableRecordImpl<TbCotationRecord> implements Record4<Long, Timestamp, Double, Long> {

    private static final long serialVersionUID = 1445248110;

    /**
     * Setter for <code>public.tb_cotation.id_cotation</code>.
     */
    public void setIdCotation(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.tb_cotation.id_cotation</code>.
     */
    public Long getIdCotation() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.tb_cotation.dt_uptade</code>.
     */
    public void setDtUptade(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.tb_cotation.dt_uptade</code>.
     */
    public Timestamp getDtUptade() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>public.tb_cotation.db_value</code>.
     */
    public void setDbValue(Double value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.tb_cotation.db_value</code>.
     */
    public Double getDbValue() {
        return (Double) get(2);
    }

    /**
     * Setter for <code>public.tb_cotation.id_asset</code>.
     */
    public void setIdAsset(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.tb_cotation.id_asset</code>.
     */
    public Long getIdAsset() {
        return (Long) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, Timestamp, Double, Long> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, Timestamp, Double, Long> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TbCotation.TB_COTATION.ID_COTATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return TbCotation.TB_COTATION.DT_UPTADE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field3() {
        return TbCotation.TB_COTATION.DB_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return TbCotation.TB_COTATION.ID_ASSET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getIdCotation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value2() {
        return getDtUptade();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value3() {
        return getDbValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getIdAsset();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbCotationRecord value1(Long value) {
        setIdCotation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbCotationRecord value2(Timestamp value) {
        setDtUptade(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbCotationRecord value3(Double value) {
        setDbValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbCotationRecord value4(Long value) {
        setIdAsset(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbCotationRecord values(Long value1, Timestamp value2, Double value3, Long value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TbCotationRecord
     */
    public TbCotationRecord() {
        super(TbCotation.TB_COTATION);
    }

    /**
     * Create a detached, initialised TbCotationRecord
     */
    public TbCotationRecord(Long idCotation, Timestamp dtUptade, Double dbValue, Long idAsset) {
        super(TbCotation.TB_COTATION);

        set(0, idCotation);
        set(1, dtUptade);
        set(2, dbValue);
        set(3, idAsset);
    }
}