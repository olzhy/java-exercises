/*
 * This file is generated by jOOQ.
 */
package com.leileiluoluo.jooq.model.generated;


import com.leileiluoluo.jooq.model.generated.tables.Course;
import com.leileiluoluo.jooq.model.generated.tables.Score;
import com.leileiluoluo.jooq.model.generated.tables.Student;
import com.leileiluoluo.jooq.model.generated.tables.records.CourseRecord;
import com.leileiluoluo.jooq.model.generated.tables.records.ScoreRecord;
import com.leileiluoluo.jooq.model.generated.tables.records.StudentRecord;

import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * school.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<CourseRecord> KEY_COURSE_PRIMARY = Internal.createUniqueKey(Course.COURSE, DSL.name("KEY_course_PRIMARY"), new TableField[] { Course.COURSE.NO }, true);
    public static final UniqueKey<ScoreRecord> KEY_SCORE_PRIMARY = Internal.createUniqueKey(Score.SCORE, DSL.name("KEY_score_PRIMARY"), new TableField[] { Score.SCORE.STUDENT_NO, Score.SCORE.COURSE_NO }, true);
    public static final UniqueKey<StudentRecord> KEY_STUDENT_PRIMARY = Internal.createUniqueKey(Student.STUDENT, DSL.name("KEY_student_PRIMARY"), new TableField[] { Student.STUDENT.NO }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<ScoreRecord, StudentRecord> SCORE_IBFK_1 = Internal.createForeignKey(Score.SCORE, DSL.name("score_ibfk_1"), new TableField[] { Score.SCORE.STUDENT_NO }, Keys.KEY_STUDENT_PRIMARY, new TableField[] { Student.STUDENT.NO }, true);
    public static final ForeignKey<ScoreRecord, CourseRecord> SCORE_IBFK_2 = Internal.createForeignKey(Score.SCORE, DSL.name("score_ibfk_2"), new TableField[] { Score.SCORE.COURSE_NO }, Keys.KEY_COURSE_PRIMARY, new TableField[] { Course.COURSE.NO }, true);
}