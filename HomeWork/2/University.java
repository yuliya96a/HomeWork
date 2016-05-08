package com.company;


public class University {

    protected String name;
    protected String address;
    protected Lesson[] lessonArray;
    protected int number;

    public University() {
        this.lessonArray = new Lesson[200];
        this.number = 0;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addLesson (Lesson lessons1) {
        this.lessonArray[this.number] = lessons1;
        this.number++;
    }

    public String toString() {
        String result = "University: " + this.name + "; \n Address: " + this.address + "\n--------\n";
        for (int i = 0; i < this.number; i++) {
            result += this.lessonArray[i].toString();
        }

        return result;
    }
}

