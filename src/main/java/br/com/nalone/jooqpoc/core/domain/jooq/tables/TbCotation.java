/*
 * This file is generated by jOOQ.
*/
package br.com.nalone.jooqpoc.core.domain.jooq.tables;


import br.com.nalone.jooqpoc.core.domain.jooq.Keys;
import br.com.nalone.jooqpoc.core.domain.jooq.Public;
import br.com.nalone.jooqpoc.core.domain.jooq.tables.records.TbCotationRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class TbCotation extends TableImpl<TbCotationRecord> {

    private static final long serialVersionUID = -1057229293;

    /**
     * The reference instance of <code>public.tb_cotation</code>
     */
    public static final TbCotation TB_COTATION = new TbCotation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TbCotationRecord> getRecordType() {
        return TbCotationRecord.class;
    }

    /**
     * The column <code>public.tb_cotation.id_cotation</code>.
     */
    public final TableField<TbCotationRecord, Long> ID_COTATION = createField("id_cotation", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.tb_cotation.dt_uptade</code>.
     */
    public final TableField<TbCotationRecord, Timestamp> DT_UPTADE = createField("dt_uptade", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>public.tb_cotation.db_value</code>.
     */
    public final TableField<TbCotationRecord, Double> DB_VALUE = createField("db_value", org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>public.tb_cotation.id_asset</code>.
     */
    public final TableField<TbCotationRecord, Long> ID_ASSET = createField("id_asset", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>public.tb_cotation</code> table reference
     */
    public TbCotation() {
        this("tb_cotation", null);
    }

    /**
     * Create an aliased <code>public.tb_cotation</code> table reference
     */
    public TbCotation(String alias) {
        this(alias, TB_COTATION);
    }

    private TbCotation(String alias, Table<TbCotationRecord> aliased) {
        this(alias, aliased, null);
    }

    private TbCotation(String alias, Table<TbCotationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TbCotationRecord> getPrimaryKey() {
        return Keys.TB_COTATION_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TbCotationRecord>> getKeys() {
        return Arrays.<UniqueKey<TbCotationRecord>>asList(Keys.TB_COTATION_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<TbCotationRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<TbCotationRecord, ?>>asList(Keys.TB_COTATION__FK3N00T1H371KFIX62QH738PFAV);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbCotation as(String alias) {
        return new TbCotation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TbCotation rename(String name) {
        return new TbCotation(name, null);
    }
}
