package com.company;

public class Lesson {

    protected int course;
    protected String group;
    protected String teacher;
    protected int audience;
    protected double time;


    public void setCourse(int course) {
        this.course = course;
    }
    public int getCourse() {
        return course;
    }

    public void setGroup(String group) {
        this.group = group;
    }
    public String getGroup() {
        return group;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
    public String getTeacher() {
        return teacher;
    }

    public void setAudience(int audience) {
        this.audience = audience;
    }
    public int getAudience(){
        return audience;
    }

    public void setTime (double time) {
        this.time = time;
    }
    public double getTime () {
        return time;
    }

    public Lesson () {}

    public Lesson (int course, String group ,String teacher, int audience, double time) {
        this.course = course;
        this.group = group;
        this.teacher = teacher;
        this.audience = audience;
        this.time = time;

    }
    public String read() {
        String result = "\nCourse: " + this.course + "\nGroup: " + this.group + "\nTeacher: " + this.teacher + "\nAudience: " + this.audience + "\nTime: " + this.time;
        return result;
    }
}
