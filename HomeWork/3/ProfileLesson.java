package com.company;


public class ProfileLesson extends Lesson {
    protected int numberOfLabs;


    public ProfileLesson(String coursename, String teacher, int audience, double time, int numberOfLabs) {
        super(coursename, teacher, audience, time);
        this.numberOfLabs = numberOfLabs;
    }

    public int getNumberOfLabs() {
        return numberOfLabs;
    }

    public void setNumberOfLabs(int numberOfLabs) {
        this.numberOfLabs = numberOfLabs;
    }

    @Override
    public String read() {
        return "\nCoursename: " + this.coursename +  "\nTeacher: " + this.teachername + "\nAudience: " + this.audience + "\nTime: " + this.time + "\nNumber of Labs" + this.numberOfLabs;
    }
}
