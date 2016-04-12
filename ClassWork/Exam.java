package com.company;

public class Exam {

    protected String subject;
    protected int mark;

    public String getSubject() {
    return subject;

    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public int getMark() {
        return mark;

    }

    public void setMark(int mark) {
        this.mark = mark;
    }
        public Exam (String subject, int mark) {
            this.subject = subject;
            this.mark = mark;

        }

}
