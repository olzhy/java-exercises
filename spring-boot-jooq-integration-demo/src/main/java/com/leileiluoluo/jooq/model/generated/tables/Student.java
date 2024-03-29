/*
 * This file is generated by jOOQ.
 */
package com.leileiluoluo.jooq.model.generated.tables;


import com.leileiluoluo.jooq.model.generated.Keys;
import com.leileiluoluo.jooq.model.generated.School;
import com.leileiluoluo.jooq.model.generated.enums.StudentGender;
import com.leileiluoluo.jooq.model.generated.tables.records.StudentRecord;

import java.time.LocalDateTime;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function4;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Student extends TableImpl<StudentRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>school.student</code>
     */
    public static final Student STUDENT = new Student();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StudentRecord> getRecordType() {
        return StudentRecord.class;
    }

    /**
     * The column <code>school.student.no</code>.
     */
    public final TableField<StudentRecord, Integer> NO = createField(DSL.name("no"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>school.student.name</code>.
     */
    public final TableField<StudentRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>school.student.gender</code>.
     */
    public final TableField<StudentRecord, StudentGender> GENDER = createField(DSL.name("gender"), SQLDataType.VARCHAR(1).nullable(false).asEnumDataType(com.leileiluoluo.jooq.model.generated.enums.StudentGender.class), this, "");

    /**
     * The column <code>school.student.birthday</code>.
     */
    public final TableField<StudentRecord, LocalDateTime> BIRTHDAY = createField(DSL.name("birthday"), SQLDataType.LOCALDATETIME(0), this, "");

    private Student(Name alias, Table<StudentRecord> aliased) {
        this(alias, aliased, null);
    }

    private Student(Name alias, Table<StudentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>school.student</code> table reference
     */
    public Student(String alias) {
        this(DSL.name(alias), STUDENT);
    }

    /**
     * Create an aliased <code>school.student</code> table reference
     */
    public Student(Name alias) {
        this(alias, STUDENT);
    }

    /**
     * Create a <code>school.student</code> table reference
     */
    public Student() {
        this(DSL.name("student"), null);
    }

    public <O extends Record> Student(Table<O> child, ForeignKey<O, StudentRecord> key) {
        super(child, key, STUDENT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : School.SCHOOL;
    }

    @Override
    public UniqueKey<StudentRecord> getPrimaryKey() {
        return Keys.KEY_STUDENT_PRIMARY;
    }

    @Override
    public Student as(String alias) {
        return new Student(DSL.name(alias), this);
    }

    @Override
    public Student as(Name alias) {
        return new Student(alias, this);
    }

    @Override
    public Student as(Table<?> alias) {
        return new Student(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Student rename(String name) {
        return new Student(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Student rename(Name name) {
        return new Student(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Student rename(Table<?> name) {
        return new Student(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, StudentGender, LocalDateTime> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super Integer, ? super String, ? super StudentGender, ? super LocalDateTime, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super Integer, ? super String, ? super StudentGender, ? super LocalDateTime, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
