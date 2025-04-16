package com.ranjeet.java;

public class Main {
    public static void main(String[] args) {
        GradeManager gm = new GradeManager();
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
			int choice;

			do {
			    System.out.println("1. Add Student");
			    System.out.println("2. Display All Students");
			    System.out.println("0. Exit");
			    System.out.print("Choose: ");
			    choice = sc.nextInt();
			    sc.nextLine(); // consume newline

			    switch (choice) {
			        case 1 -> gm.addStudent();
			        case 2 -> gm.displayAll();
			        case 0 -> System.out.println("Goodbye!");
			        default -> System.out.println("Invalid choice!");
			    }
			} while (choice != 0);
		}
    }
}