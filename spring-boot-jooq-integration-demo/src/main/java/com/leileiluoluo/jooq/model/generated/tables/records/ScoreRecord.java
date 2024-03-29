/*
 * This file is generated by jOOQ.
 */
package com.leileiluoluo.jooq.model.generated.tables.records;


import com.leileiluoluo.jooq.model.generated.tables.Score;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ScoreRecord extends UpdatableRecordImpl<ScoreRecord> implements Record3<Integer, Integer, BigDecimal> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>school.score.student_no</code>.
     */
    public void setStudentNo(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>school.score.student_no</code>.
     */
    public Integer getStudentNo() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>school.score.course_no</code>.
     */
    public void setCourseNo(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>school.score.course_no</code>.
     */
    public Integer getCourseNo() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>school.score.degree</code>.
     */
    public void setDegree(BigDecimal value) {
        set(2, value);
    }

    /**
     * Getter for <code>school.score.degree</code>.
     */
    public BigDecimal getDegree() {
        return (BigDecimal) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Integer, Integer> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Integer, BigDecimal> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, Integer, BigDecimal> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Score.SCORE.STUDENT_NO;
    }

    @Override
    public Field<Integer> field2() {
        return Score.SCORE.COURSE_NO;
    }

    @Override
    public Field<BigDecimal> field3() {
        return Score.SCORE.DEGREE;
    }

    @Override
    public Integer component1() {
        return getStudentNo();
    }

    @Override
    public Integer component2() {
        return getCourseNo();
    }

    @Override
    public BigDecimal component3() {
        return getDegree();
    }

    @Override
    public Integer value1() {
        return getStudentNo();
    }

    @Override
    public Integer value2() {
        return getCourseNo();
    }

    @Override
    public BigDecimal value3() {
        return getDegree();
    }

    @Override
    public ScoreRecord value1(Integer value) {
        setStudentNo(value);
        return this;
    }

    @Override
    public ScoreRecord value2(Integer value) {
        setCourseNo(value);
        return this;
    }

    @Override
    public ScoreRecord value3(BigDecimal value) {
        setDegree(value);
        return this;
    }

    @Override
    public ScoreRecord values(Integer value1, Integer value2, BigDecimal value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ScoreRecord
     */
    public ScoreRecord() {
        super(Score.SCORE);
    }

    /**
     * Create a detached, initialised ScoreRecord
     */
    public ScoreRecord(Integer studentNo, Integer courseNo, BigDecimal degree) {
        super(Score.SCORE);

        setStudentNo(studentNo);
        setCourseNo(courseNo);
        setDegree(degree);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised ScoreRecord
     */
    public ScoreRecord(com.leileiluoluo.jooq.model.generated.tables.pojos.Score value) {
        super(Score.SCORE);

        if (value != null) {
            setStudentNo(value.getStudentNo());
            setCourseNo(value.getCourseNo());
            setDegree(value.getDegree());
            resetChangedOnNotNull();
        }
    }
}
