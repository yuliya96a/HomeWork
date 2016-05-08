package com.company;

public class Main {

    public static void main(String[] args) {

        University university = new University();
        university.setName("ChNU");
        university.setAddress ("Cherkasy, Shevchenko boulevard , 81");

        System.out.println(university.toString());

        Lesson lessons1 = new Lesson();
        lessons1.setCourse(2);
        lessons1.setGroup("Economic Cybernetics");
        lessons1.setTeachername("Fedorov N.");
        lessons1.setAudience(407);
        lessons1.setTime(9.20);

        university.addLesson (lessons1);

        lessons1 = new Lesson();
        lessons1.setCourse(1);
        lessons1.setGroup("Accounting and Auditing");
        lessons1.setTeachername("Petrov T.");
        lessons1.setAudience(705);
        lessons1.setTime(11.20);
        university.addLesson (lessons1);

        lessons1 = new Lesson();
        lessons1.setCourse(5);
        lessons1.setGroup("International Economics");
        lessons1.setTeachername("Vasilyev K.");
        lessons1.setAudience(389);
        lessons1.setTime(8.00);
        university.addLesson (lessons1);
    }
}
