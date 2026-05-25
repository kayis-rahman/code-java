package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Students Management System

        Subject[] subject = new Subject[2];
        subject[0] = new Subject("Maths", "theory");
        subject[1] = new Subject("IT", "practical");


        Classz classz = new Classz("10", 'A', subject);

        Student kani = new Student("Kani", classz);

        List<MarkDetails> markDetails = getMarkDetailsAsList();

        Marksheet marksheet = new Marksheet(markDetails, kani);

//        System.out.println("marksheet = " + marksheet);
        System.out.println("---------------------------------------------");
        System.out.println("This is the marksheet for the student " + marksheet.getStudent().getName());
        System.out.println("---------------------------------------------");
        System.out.println("-------------------Subjects------------------");

        List<MarkDetails> marks = marksheet.getMarkDetails();

//        for (initialization; condition; incremetal/decremental) {
        // Statement of body
//        }
        int length = marks.size(); // 3

        for (MarkDetails mark : marks) { // i = 3, 3 < 3 = false
            System.out.printf("Subject : %s, Mark: %d, Grade: %c \n",
                    mark.getSubject().getName(), mark.getMark(), mark.getGrade());
        }
//        forI(length, marks);
//        forDec(length, marks);
//        whileLoop(length, marks);
//        doWhile(marks, length);

//        MarkDetails mark = marks[0];
//        System.out.printf("Subject : %s, Mark: %d, Grade: %c \n",
//                mark.getSubject().getName(), mark.getMark(), mark.getGrade());
//
//        MarkDetails mark2 = marks[1];
//        System.out.printf("Subject : %s, Mark: %d, Grade: %c \n",
//                mark2.getSubject().getName(), mark2.getMark(), mark2.getGrade());
//
//        MarkDetails mark3 = marks[2];
//        System.out.printf("Subject : %s, Mark: %d, Grade: %c \n",
//                mark3.getSubject().getName(), mark3.getMark(), mark3.getGrade());


        System.out.println("---------------------------------------------");
    }

    private static void forI(int length, List<MarkDetails> marks) {
        for (int i = 0; i < length; i++) { // i = 3, 3 < 3 = false
            MarkDetails mark = marks.get(i);
            System.out.printf("Subject : %s, Mark: %d, Grade: %c \n",
                    mark.getSubject().getName(), mark.getMark(), mark.getGrade());
        }
    }

    private static MarkDetails[] getMarkDetailsAsArray() {
        MarkDetails[] markDetails = new MarkDetails[4];
        Subject maths = new Subject("Maths", "theory");
        Subject it = new Subject("Information Technology", "practical");
        Subject chemistry = new Subject("Chemistry", "theory");
        Subject physics = new Subject("Physics", "theory");

        markDetails[0] = new MarkDetails(maths, 70, 'B');
        markDetails[1] = new MarkDetails(it, 99, 'A');
        markDetails[2] = new MarkDetails(chemistry, 90, 'A');
        markDetails[3] = new MarkDetails(physics, 60, 'C');
        return markDetails;
    }
    private static List<MarkDetails> getMarkDetailsAsList() {
        List<MarkDetails> markDetails = new ArrayList<>();

        Subject maths = new Subject("Maths", "theory");
        Subject it = new Subject("Information Technology", "practical");
        Subject chemistry = new Subject("Chemistry", "theory");
        Subject physics = new Subject("Physics", "theory");

        markDetails.add(new MarkDetails(maths, 70, 'B'));
        markDetails.add(new MarkDetails(it, 99, 'A'));
        markDetails.add(new MarkDetails(chemistry, 90, 'A'));
        markDetails.add(new MarkDetails(physics, 60, 'C'));
        return markDetails;
    }

    private static void forDec(int length, MarkDetails[] marks) {
        for (int i = length, j = 0; i >= 1; i--, j++) { // i = 3, j = 2; 1 >= 1 = false
            MarkDetails mark = marks[j];
            System.out.printf("Subject : %s, Mark: %d, Grade: %c \n",
                    mark.getSubject().getName(), mark.getMark(), mark.getGrade());
        }
    }

    private static void whileLoop(int length, MarkDetails[] marks) {
        int i = 0;
        while (i < length && i >= 0) { // i = 3, 3 < 3 = false
            MarkDetails mark = marks[i];
            System.out.printf("Subject : %s, Mark: %d, Grade: %c \n",
                    mark.getSubject().getName(), mark.getMark(), mark.getGrade());
            i++;
        }
    }

    private static void doWhile(MarkDetails[] marks, int length) {
        int i = 0;
        do {
            MarkDetails mark = marks[i];
            System.out.printf("Subject : %s, Mark: %d, Grade: %c \n",
                    mark.getSubject().getName(), mark.getMark(), mark.getGrade());
            i++;
        }
        while (i < length);
    }


    /**
     * This is the carExample
     *
     * @param args This a string args[] which will pass from another method
     * @author Kayis Rahman
     * @since v1
     */
    public void carExample(String[] args) {
        System.out.println("----- MAIN -----");


        // Object of Car
        Car car = new Car();
        car.publicDrive();

        System.out.println("car.sum() = " + car.sum(1, 2, 3));


        System.out.println("------------ Show Properties -----------");
        System.out.println(car.getColor());
        System.out.println(car.getBrand());
        System.out.println(car.getClassZ());
        System.out.println(car.getNoOfWheels());


        System.out.println("------------ Update Properties -----------");
        car.setBrand("Tesla");
        car.setColor("Green");
        car.setClassZ('X');
        car.setNoOfWheels(5);

        System.out.println(car.getColor());
        System.out.println(car.getBrand());
        System.out.println(car.getClassZ());
        System.out.println(car.getNoOfWheels());

    }

}
