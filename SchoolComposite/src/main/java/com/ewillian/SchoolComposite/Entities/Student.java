package com.ewillian.SchoolComposite.Entities;

import java.util.Date;

public class Student {

    private long PKid;
    private long FK_id;
    private String firstName;
    private String lastName;
    private Date birthDate;

    public long getPKid() {
        return PKid;
    }

    public void setPKid(long PKid) {
        this.PKid = PKid;
    }

    public long getFK_id() {
        return FK_id;
    }

    public void setFK_id(long FK_id) {
        this.FK_id = FK_id;
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
