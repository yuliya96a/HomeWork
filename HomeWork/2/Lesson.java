package com.company;

public class Lesson {

    protected int course;
    protected String group;
    protected String teachername;
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

    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }
    public String getTeacher() {
        return teachername;
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
        this.teachername = teacher;
        this.audience = audience;
        this.time = time;

    }
    public String read() {
        String result = "\nCourse: " + this.course + "\nGroup: " + this.group + "\nTeacher: " + this.teachername + "\nAudience: " + this.audience + "\nTime: " + this.time;
        return result;
    }
}
