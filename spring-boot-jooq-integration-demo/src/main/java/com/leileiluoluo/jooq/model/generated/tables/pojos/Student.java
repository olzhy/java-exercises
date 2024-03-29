/*
 * This file is generated by jOOQ.
 */
package com.leileiluoluo.jooq.model.generated.tables.pojos;


import com.leileiluoluo.jooq.model.generated.enums.StudentGender;

import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer no;
    private String name;
    private StudentGender gender;
    private LocalDateTime birthday;

    public Student() {}

    public Student(Student value) {
        this.no = value.no;
        this.name = value.name;
        this.gender = value.gender;
        this.birthday = value.birthday;
    }

    public Student(
        Integer no,
        String name,
        StudentGender gender,
        LocalDateTime birthday
    ) {
        this.no = no;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
    }

    /**
     * Getter for <code>school.student.no</code>.
     */
    public Integer getNo() {
        return this.no;
    }

    /**
     * Setter for <code>school.student.no</code>.
     */
    public void setNo(Integer no) {
        this.no = no;
    }

    /**
     * Getter for <code>school.student.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>school.student.name</code>.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for <code>school.student.gender</code>.
     */
    public StudentGender getGender() {
        return this.gender;
    }

    /**
     * Setter for <code>school.student.gender</code>.
     */
    public void setGender(StudentGender gender) {
        this.gender = gender;
    }

    /**
     * Getter for <code>school.student.birthday</code>.
     */
    public LocalDateTime getBirthday() {
        return this.birthday;
    }

    /**
     * Setter for <code>school.student.birthday</code>.
     */
    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Student other = (Student) obj;
        if (this.no == null) {
            if (other.no != null)
                return false;
        }
        else if (!this.no.equals(other.no))
            return false;
        if (this.name == null) {
            if (other.name != null)
                return false;
        }
        else if (!this.name.equals(other.name))
            return false;
        if (this.gender == null) {
            if (other.gender != null)
                return false;
        }
        else if (!this.gender.equals(other.gender))
            return false;
        if (this.birthday == null) {
            if (other.birthday != null)
                return false;
        }
        else if (!this.birthday.equals(other.birthday))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.no == null) ? 0 : this.no.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.gender == null) ? 0 : this.gender.hashCode());
        result = prime * result + ((this.birthday == null) ? 0 : this.birthday.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Student (");

        sb.append(no);
        sb.append(", ").append(name);
        sb.append(", ").append(gender);
        sb.append(", ").append(birthday);

        sb.append(")");
        return sb.toString();
    }
}
