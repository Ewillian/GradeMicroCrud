package com.ewillian.SchoolComposite.Entities;

import java.util.Date;

public class Teacher {

    private long PKid;

    private String firstName;

    private String lastName;

    private Date birthDate;

    public long getPKid() {
        return PKid;
    }

    public void setPKid(long PKid) {
        this.PKid = PKid;
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