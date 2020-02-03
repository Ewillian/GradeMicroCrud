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

    public static void main(String[] args) {
        String pattern = "MM/dd/yyyy";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        try {
            Date date = format.parse("12/31/2006");
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        // formatting
        System.out.println(format.format(new Date()));
    }

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)


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