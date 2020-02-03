package com.Ewillian.teacherCore.Entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class Teacher {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
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