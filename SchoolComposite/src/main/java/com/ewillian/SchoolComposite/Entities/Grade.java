package com.ewillian.SchoolComposite.Entities;

public class Grade {

    private long id;

    private String title;

    private String headTeacher;

    private String year;

    public long getid() {
        return id;
    }

    public void setid(long id) {
        this.id = id;
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
