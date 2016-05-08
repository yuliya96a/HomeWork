package com.company;

        import java.util.ArrayList;
        import java.util.LinkedList;
        import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Lesson> mondayLessons = new ArrayList<Lesson>();
        mondayLessons.add(new Lesson( "Economic Cybernetics", "Solovyov V.", 203, 8.00));
        mondayLessons.add(new Lesson( "Differential Equations", "Tobilevych J.", 424, 9.40));
        mondayLessons.add(new Lesson( "Statistics", "Hadetska Z.", 516, 11.20));
        int mondayLessonsNumber = 3;


        List<Lesson> tuesdayLessons = new ArrayList<Lesson>();
        tuesdayLessons.add(new Lesson( "Optimization Methods and Models", "Tobilevych J.", 401, 8.00));
        tuesdayLessons.add(new Lesson( "Philosophy", "Shevchenko Z.", 226, 9.40));
        tuesdayLessons.add(new Lesson( "Monitoring System", "Danylchuk G.", 204, 11.00));
        tuesdayLessons.add(new Lesson( "Physical Education", "Kotegova L.", 300, 13.00));
        int tuesdayLessonsNumber = 4;

        List<Lesson> wednesdayLessons = new ArrayList<Lesson>();
        wednesdayLessons.add(new Lesson( "Object Oriented Programming", "Chabanenko D.", 204, 8.00));
        wednesdayLessons.add(new Lesson( "English", "Trubenko H.", 205, 9.40));
        wednesdayLessons.add(new Lesson( "Ukrainian language", "Fedorov N.", 424,11.20 ));
        int wednesdayLessonsNumber = 3;


        List<Lesson> thursdayLessons = new ArrayList<Lesson>();
        thursdayLessons.add(new Lesson( "Computer networks and systems", "Hadetska Z.", 204, 8.00));
        thursdayLessons.add(new Lesson( "Macroeconomics", "Sutula V.", 201, 9.40));
        thursdayLessons.add(new Lesson( "Macroeconomics", "Sutula V.", 423, 11.20 ));
        thursdayLessons.add(new Lesson( "Physical Education", "Kotegova L.", 300, 13.00));
        int thursdayLessonsNumber = 4;

        List<Lesson> fridayLessons = new ArrayList <Lesson>();
        thursdayLessons.add(new Lesson( "Functional analysis", "Denisenko V.", 424, 8.00));
        thursdayLessons.add(new Lesson( "The theory of random processes", "Denisenko V.", 204, 9.40));
        int fridayLessonsNumber = 2;


        List<ProfileLesson> tuesdayProfileLessons = new LinkedList<ProfileLesson>();
        tuesdayProfileLessons.add(new ProfileLesson( "Optimization Methods and Models", "Tobilevych J.", 401, 8.00, 1));
        tuesdayProfileLessons.add(new ProfileLesson( "Monitoring System", "Danylchuk G.", 204, 11.00, 2));

        List<ProfileLesson> wednesdayProfileLessons = new LinkedList<ProfileLesson>();
        wednesdayProfileLessons.add(new ProfileLesson( "Optimization Methods and Models", "Chabanenko D.", 204, 8.00, 1));


        try {
            System.out.println("All lessons for monday:");
            for (Lesson l : mondayLessons) {
                System.out.println(l.read());
            }
            System.out.println("\n All lessons for tuesday:");
            for (int i = 0; i < tuesdayLessonsNumber; i++) {
                System.out.println(tuesdayLessons.get(i).read());
            }
            System.out.println("\n All lessons for wednesday:");
            for (int i = 0; i < wednesdayLessonsNumber; i++) {
                System.out.println(wednesdayLessons.get(i).read());
            }
            System.out.println("\n All lessons for thursday:");
            for (int i = 0; i < thursdayLessonsNumber; i++) {
                System.out.println(thursdayLessons.get(i).read());
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Oops! Seems, we have a problem, here is your stack of error messages \n");
            e.printStackTrace();
        }


        int tuesdayLabsNumber = 0;
        for (int i = 0; i < tuesdayProfileLessons.size(); i++) {
            tuesdayLabsNumber += tuesdayProfileLessons.get(i).getNumberOfLabs();
        }
        System.out.println("\n Number of all labs in tuesday: " + tuesdayLabsNumber);

        int wednesdayLabsNumber = 0;
        for (int i = 0; i < wednesdayProfileLessons.size(); i++) {
            wednesdayLabsNumber += wednesdayProfileLessons.get(i).getNumberOfLabs();
        }
        System.out.println("\n Number of all labs in wednesday: " + wednesdayLabsNumber);

       

    }
}
