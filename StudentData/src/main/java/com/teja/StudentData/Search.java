package com.teja.StudentData;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Sai Teja
 *
 */
public class Search {

    /**ArrayList to store all user details.*/
    private static ArrayList<Student> students;

    /**Scanner object. */
    private static Scanner scanner;

    /**ID. */
    private static final int ID = 1;

    /**FIRST_NAME. */
    private static final int FIRST_NAME = 2;

    /**LAST_NAME. */
    private static final int LAST_NAME = 3;

    /**AGE. */
    private static final int AGE = 4;

    /**GENDER. */
    private static final int GENDER = 5;

    /**DEPT. */
    private static final int DEPT = 6;

    /**YEAR. */
    private static final int YEAR = 7;

    /**
     * Constructor.
     * @param data - Student details.
     */
    Search(final ArrayList<Student> data) {
        Search.students = data;
    }

    /**
     *Driver class which performs search operations.
     */
    public void driver() {
        System.out.println("Please select your search category\n 1.ID");
        System.out.println(" 2.First Name\n 3.Last Name");
        System.out.println(" 4.Age\n 5.Gender");

        System.out.println(" 6.Department\n 7.Year of Study");
        scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case ID: Search.basedOnId();
                    break;
            case FIRST_NAME: Search.basedOnFirstName();
                    break;
            case LAST_NAME: Search.basedOnLastName();
                    break;
            case AGE: Search.basedOnAge();
                    break;
            case GENDER: Search.basedOnGender();
                    break;
            case DEPT: Search.basedOnDepartment();
                    break;
            case YEAR: Search.basedOnYear();
                    break;
            default: System.out.println("Invalid choice");
        }
    }

    /**
     * Search based on ID.
     */
    public static void basedOnId() {
        System.out.println("Please enter Age");
        int inputID = scanner.nextInt();

        for (Student student : students) {
            if (inputID == student.getId()) {
                System.out.println(student);
            }
        }
    }
     /**
     * Search based on First Name.
     */
    public static void basedOnFirstName() {
        System.out.println("Please enter First name");
        String inputName = scanner.next();

        for (Student student : students) {
            if (inputName.equalsIgnoreCase(student.getFirstName())) {
                System.out.println(student);
            }
        }
    }

    /**
     * Search based on Last Name.
     */
    public static void basedOnLastName() {
        System.out.println("Please enter Last name");
        String inputName = scanner.next();

        for (Student student : students) {
            if (inputName.equalsIgnoreCase(student.getLastName())) {
                System.out.println(student);
            }
        }
    }

    /**
     * Search based on Age.
     */
    public static void basedOnAge() {
        System.out.println("Please enter Age");
        int inputAge = scanner.nextInt();

        for (Student student : students) {
            if (inputAge == student.getAge()) {
                System.out.println(student);
            }
        }
    }

    /**
     * Search based on Gender.
     */
    public static void basedOnGender() {
        System.out.println("Please enter Gender");
        String inputGender = scanner.next();

        for (Student student : students) {
            if (inputGender.equalsIgnoreCase(student.getGender())) {
                System.out.println(student);
            }
        }
    }

    /**
     * Search based on Department.
     */
    public static void basedOnDepartment() {
        System.out.println("Please enter Department");
        String inputDept = scanner.next();

        for (Student student : students) {
            if (inputDept.equalsIgnoreCase(student.getDept())) {
                System.out.println(student);
            }
        }
    }

    /**
     * Search based on Year.
     */
    public static void basedOnYear() {
        System.out.println("Please enter Year");
        int inputYear = scanner.nextInt();

        for (Student student : students) {
            if (inputYear == student.getYear()) {
                System.out.println(student);
            }
        }
    }
}
