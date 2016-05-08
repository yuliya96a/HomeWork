package com.company;


public class Lesson {

    protected String coursename;
    protected String teachername;
    protected int audience;
    protected double time;



    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }
    public String getCoursename() {
        return coursename;
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

    public Lesson (String coursename ,String teacher, int audience, double time) {

        this.coursename = coursename;
        this.teachername = teacher;
        this.audience = audience;
        this.time = time;

    }
    public String read() {
        String result = "\nCoursename: " + this.coursename + "\nTeacher: " + this.teachername + "\nAudience: " + this.audience + "\nTime: " + this.time;
        return result;
    }
}
