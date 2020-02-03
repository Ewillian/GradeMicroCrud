package com.ewillian.gradeCore.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Grade {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long PKid;

    private String title;

    private String headTeacher;

    private String year;

    public long getPKid() {
        return PKid;
    }

    public void setPKid(long PKid) {
        this.PKid = PKid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHeadTeacher() {
        return headTeacher;
    }

    public void setHeadTeacher(String headTeacher) {
        this.headTeacher = headTeacher;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
