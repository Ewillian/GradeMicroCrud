package com.ewillian.SchoolComposite.Entities;

public class Student {

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
