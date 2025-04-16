package com.ranjeet.java;
import java.util.ArrayList;
import java.util.Scanner;

public class GradeManager {
    ArrayList<Student> students = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addStudent() {
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        int[] marks = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter mark " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        sc.nextLine(); // consume leftover newline
        students.add(new Student(name, marks));
    }

    public void displayAll() {
        for (Student s : students) {
            s.printDetails();
            System.out.println("-------------------");
        }
    }
}