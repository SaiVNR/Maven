package com.teja.StudentData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author Sai Teja
 *
 */
public class Sort {

    /**ArrayList to store all user details.*/
    private static ArrayList<Student> students;

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

    /**Scanner object. */
    private static Scanner scanner;

    /**
     * Constructor.
     * @param data - Student details.
     */
    Sort(final ArrayList<Student> data) {
        Sort.students = data;
    }

    /**
     *Driver class which performs search operations.
     */
    public void driver() {
        System.out.println("Please select your sort category\n 1.ID");
        System.out.println(" 2.First Name\n 3.Last Name");
        System.out.println(" 4.Age\n 5.Gender");
        System.out.println(" 6.Department\n 7.Year of Study");
        scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {

            case ID: Sort.basedOnId();
                    break;
            case FIRST_NAME: Sort.basedOnFirstName();
                    break;
            case LAST_NAME: Sort.basedOnLastName();
                    break;
            case AGE: Sort.basedOnAge();
                    break;
            case GENDER: Sort.basedOnGender();
                    break;
            case DEPT: Sort.basedOnDepartment();
                    break;
            case YEAR: Sort.basedOnYear();
                    break;
            default: System.out.println("Invalid choice");
        }
    }

    /**
     * Sort based on ID.
     */
    public static void basedOnId() {
        System.out.println("Please Choose:");
        System.out.println(" 1.Ascending Order \n 2.Descending Order");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: Collections.sort(students, new Comparator<Object>() {
                        public int compare(final Object o1, final Object o2) {
                            Student obj1 = (Student) o1;
                            Student obj2 = (Student) o2;
                            return obj1.getId() - obj2.getId();
                        }
            });
            for (Student student : students) {
                System.out.println(student);
            }
                    break;
            case 2: Collections.sort(students, new Comparator<Object>() {
                        public int compare(final Object o1, final Object o2) {
                            Student obj1 = (Student) o1;
                            Student obj2 = (Student) o2;
                            return obj2.getId() - obj1.getId();
                        }
            });
            for (Student student : students) {
                System.out.println(student);
            }
                    break;
            default: System.out.println("Invalid choice");
        }

    }

    /**
     * Sort based on First Name.
     */
    public static void basedOnFirstName() {
        System.out.println("Please Choose:");
        System.out.println(" 1.Ascending Order \n 2.Descending Order");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: Collections.sort(students, new Comparator<Object>() {
                        public int compare(final Object o1, final Object o2) {
                            Student obj1 = (Student) o1;
                            Student obj2 = (Student) o2;
                            return obj1.getFirstName()
                                       .compareTo(obj2.getFirstName());
                        }
            });
            for (Student student : students) {
                System.out.println(student);
            }
                    break;
            case 2: Collections.sort(students, new Comparator<Object>() {
                        public int compare(final Object o1, final Object o2) {
                            Student obj1 = (Student) o1;
                            Student obj2 = (Student) o2;
                            return obj2.getFirstName()
                                       .compareTo(obj1.getFirstName());
                        }
            });
            for (Student student : students) {
                System.out.println(student);
            }
                    break;

            default: System.out.println("Invalid choice");
        }


    }

    /**
     * Sort based on Last Name.
     */
    public static void basedOnLastName() {
        System.out.println("Please Choose:");
        System.out.println(" 1.Ascending Order \n 2.Descending Order");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: Collections.sort(students, new Comparator<Object>() {
                        public int compare(final Object o1, final Object o2) {
                            Student obj1 = (Student) o1;
                            Student obj2 = (Student) o2;
                            return obj1.getLastName()
                                       .compareTo(obj2.getLastName());
                        }
            });
            for (Student student : students) {
                System.out.println(student);
            }
                    break;
            case 2: Collections.sort(students, new Comparator<Object>() {
                        public int compare(final Object o1, final Object o2) {
                            Student obj1 = (Student) o1;
                            Student obj2 = (Student) o2;
                            return obj2.getLastName()
                                       .compareTo(obj1.getLastName());
                        }
            });
            for (Student student : students) {
                System.out.println(student);
            }
                    break;

            default: System.out.println("Invalid choice");
        }

    }

    /**
     * Sort based on Age.
     */
    public static void basedOnAge() {
        System.out.println("Please Choose:");
        System.out.println(" 1.Ascending Order \n 2.Descending Order");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: Collections.sort(students, new Comparator<Object>() {
                        public int compare(final Object o1, final Object o2) {
                            Student obj1 = (Student) o1;
                            Student obj2 = (Student) o2;
                            return obj1.getAge() - obj2.getAge();
                        }
            });
            for (Student student : students) {
                System.out.println(student);
            }
                    break;
            case 2: Collections.sort(students, new Comparator<Object>() {
                        public int compare(final Object o1, final Object o2) {
                            Student obj1 = (Student) o1;
                            Student obj2 = (Student) o2;
                            return obj2.getAge() - obj1.getAge();
                        }
            });
            for (Student student : students) {
                System.out.println(student);
            }
                    break;
            default: System.out.println("Invalid choice");
        }


    }

    /**
     * Sort based on Gender.
     */
    public static void basedOnGender() {
        System.out.println("Please Choose:");
        System.out.println(" 1.Ascending Order \n 2.Descending Order");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: Collections.sort(students, new Comparator<Object>() {
                        public int compare(final Object o1, final Object o2) {
                            Student obj1 = (Student) o1;
                            Student obj2 = (Student) o2;
                            return obj1.getGender()
                                       .compareTo(obj2.getGender());
                        }
            });
            for (Student student : students) {
                System.out.println(student);
            }
                    break;
            case 2: Collections.sort(students, new Comparator<Object>() {
                        public int compare(final Object o1, final Object o2) {
                            Student obj1 = (Student) o1;
                            Student obj2 = (Student) o2;
                            return obj2.getGender()
                                       .compareTo(obj1.getGender());
                        }
            });
            for (Student student : students) {
                System.out.println(student);
            }
                    break;

            default: System.out.println("Invalid choice");
        }

    }

    /**
     * Sort based on Department.
     *
     */
    public static void basedOnDepartment() {
        System.out.println("Please Choose:");
        System.out.println(" 1.Ascending Order \n 2.Descending Order");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: Collections.sort(students, new Comparator<Object>() {
                        public int compare(final Object o1, final Object o2) {
                            Student obj1 = (Student) o1;
                            Student obj2 = (Student) o2;
                            return obj1.getDept()
                                       .compareTo(obj2.getDept());
                        }
            });
            for (Student student : students) {
                System.out.println(student);
            }
                    break;
            case 2: Collections.sort(students, new Comparator<Object>() {
                        public int compare(final Object o1, final Object o2) {
                            Student obj1 = (Student) o1;
                            Student obj2 = (Student) o2;
                            return obj2.getDept()
                                       .compareTo(obj1.getDept());
                        }
            });
            for (Student student : students) {
                System.out.println(student);
            }
                    break;

            default: System.out.println("Invalid choice");
        }


    }

    /**
     * Sort based on Year.
     */
    public static void basedOnYear() {
        System.out.println("Please Choose:");
        System.out.println(" 1.Ascending Order \n 2.Descending Order");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: Collections.sort(students, new Comparator<Object>() {
                        public int compare(final Object o1, final Object o2) {
                            Student obj1 = (Student) o1;
                            Student obj2 = (Student) o2;
                            return obj1.getYear() - obj2.getYear();
                        }
            });
            for (Student student : students) {
                System.out.println(student);
            }
                    break;
            case 2: Collections.sort(students, new Comparator<Object>() {
                        public int compare(final Object o1, final Object o2) {
                            Student obj1 = (Student) o1;
                            Student obj2 = (Student) o2;
                            return obj2.getYear() - obj1.getYear();
                        }
            });
            for (Student student : students) {
                System.out.println(student);
            }
                    break;
            default: System.out.println("Invalid choice");
        }


    }
}
