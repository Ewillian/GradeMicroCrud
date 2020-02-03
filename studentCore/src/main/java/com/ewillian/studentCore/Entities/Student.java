package com.ewillian.studentCore.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class Student {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)


    private long id;
    private long gradeid;
    private String firstName;
    private String lastName;
    private String birthDate;

    public long getid() {
        return id;
    }

    public void setid(long id) {
        this.id = id;
    }

    public long getgradeid() {
        return gradeid;
    }

    public void setgradeid(long gradeid) {
        this.gradeid = gradeid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}