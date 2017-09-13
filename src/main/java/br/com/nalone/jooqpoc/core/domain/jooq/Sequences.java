/*
 * This file is generated by jOOQ.
*/
package br.com.nalone.jooqpoc.core.domain.jooq;


import javax.annotation.Generated;

import org.jooq.Sequence;
import org.jooq.impl.SequenceImpl;


/**
 * Convenience access to all sequences in public
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

    /**
     * The sequence <code>public.asset_id_asset_seq</code>
     */
    public static final Sequence<Long> ASSET_ID_ASSET_SEQ = new SequenceImpl<Long>("asset_id_asset_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>public.cotation_id_cotation_seq</code>
     */
    public static final Sequence<Long> COTATION_ID_COTATION_SEQ = new SequenceImpl<Long>("cotation_id_cotation_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>public.investor_id_investor_seq</code>
     */
    public static final Sequence<Long> INVESTOR_ID_INVESTOR_SEQ = new SequenceImpl<Long>("investor_id_investor_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>public.wallet_id_wallet_seq</code>
     */
    public static final Sequence<Long> WALLET_ID_WALLET_SEQ = new SequenceImpl<Long>("wallet_id_wallet_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));
}
