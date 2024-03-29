/*
 * This file is generated by jOOQ.
 */
package com.leileiluoluo.jooq.model.generated;


import com.leileiluoluo.jooq.model.generated.tables.Score;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables in school.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index SCORE_COURSE_NO = Internal.createIndex(DSL.name("course_no"), Score.SCORE, new OrderField[] { Score.SCORE.COURSE_NO }, false);
}
