/*
 * This file is generated by jOOQ.
 */
package com.leileiluoluo.jooq.model.generated.tables.records;


import com.leileiluoluo.jooq.model.generated.enums.StudentGender;
import com.leileiluoluo.jooq.model.generated.tables.Student;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StudentRecord extends UpdatableRecordImpl<StudentRecord> implements Record4<Integer, String, StudentGender, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>school.student.no</code>.
     */
    public void setNo(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>school.student.no</code>.
     */
    public Integer getNo() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>school.student.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>school.student.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>school.student.gender</code>.
     */
    public void setGender(StudentGender value) {
        set(2, value);
    }

    /**
     * Getter for <code>school.student.gender</code>.
     */
    public StudentGender getGender() {
        return (StudentGender) get(2);
    }

    /**
     * Setter for <code>school.student.birthday</code>.
     */
    public void setBirthday(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>school.student.birthday</code>.
     */
    public LocalDateTime getBirthday() {
        return (LocalDateTime) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, StudentGender, LocalDateTime> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, String, StudentGender, LocalDateTime> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Student.STUDENT.NO;
    }

    @Override
    public Field<String> field2() {
        return Student.STUDENT.NAME;
    }

    @Override
    public Field<StudentGender> field3() {
        return Student.STUDENT.GENDER;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return Student.STUDENT.BIRTHDAY;
    }

    @Override
    public Integer component1() {
        return getNo();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public StudentGender component3() {
        return getGender();
    }

    @Override
    public LocalDateTime component4() {
        return getBirthday();
    }

    @Override
    public Integer value1() {
        return getNo();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public StudentGender value3() {
        return getGender();
    }

    @Override
    public LocalDateTime value4() {
        return getBirthday();
    }

    @Override
    public StudentRecord value1(Integer value) {
        setNo(value);
        return this;
    }

    @Override
    public StudentRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public StudentRecord value3(StudentGender value) {
        setGender(value);
        return this;
    }

    @Override
    public StudentRecord value4(LocalDateTime value) {
        setBirthday(value);
        return this;
    }

    @Override
    public StudentRecord values(Integer value1, String value2, StudentGender value3, LocalDateTime value4) {
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
     * Create a detached StudentRecord
     */
    public StudentRecord() {
        super(Student.STUDENT);
    }

    /**
     * Create a detached, initialised StudentRecord
     */
    public StudentRecord(Integer no, String name, StudentGender gender, LocalDateTime birthday) {
        super(Student.STUDENT);

        setNo(no);
        setName(name);
        setGender(gender);
        setBirthday(birthday);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised StudentRecord
     */
    public StudentRecord(com.leileiluoluo.jooq.model.generated.tables.pojos.Student value) {
        super(Student.STUDENT);

        if (value != null) {
            setNo(value.getNo());
            setName(value.getName());
            setGender(value.getGender());
            setBirthday(value.getBirthday());
            resetChangedOnNotNull();
        }
    }
}
