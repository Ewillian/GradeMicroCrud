package com.ewillian.SchoolComposite.Entities;

import java.util.Date;

public class Student {

    private long id;
    private long gradeid;
    private String firstName;
    private String lastName;
    private Date birthDate;

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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
