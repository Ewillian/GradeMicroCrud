package com.ewillian.Api.Entities;

import java.util.Date;

public class Teacher {

    private long id;

    private String firstName;

    private String lastName;

    private Date birthDate;

    public long getid() {
        return id;
    }

    public void setid(long id) {
        this.id = id;
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

    public void setLastName(String longName) {
        this.lastName = longName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
