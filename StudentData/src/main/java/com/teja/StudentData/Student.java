package com.teja.StudentData;

/**
 * @author Sai Teja.
 * description Student Bean.
 *
 */
public final class Student {

    /** To store author.*/
    private int idOfStudent;

    /** To store first name.*/
    private String firstNameOfStudent;

    /** To store last name.*/
    private String lastNameOfStudent;

    /** To store age of student.*/
    private int ageOfStudent;

    /** To store gender of student.*/
    private String genderOfStudent;

    /** To store department of student.*/
    private String deptOfStudent;

    /** To store year of student.*/
    private int yearOfStudent;


    /**
     * @param id - id of Student
     * @param firstName - firstName of Student
     * @param lastName - lastName of Student
     * @param age - age of Student
     * @param gender - gender of Student
     * @param dept - dept of Student
     * @param yearOfStudy - yearOfStudy of Student
     */
    Student(final int id, final String firstName,
            final String lastName, final int age,
            final String gender, final String dept,
            final int yearOfStudy) {

        this.idOfStudent = id;
        this.firstNameOfStudent = firstName;
        this.lastNameOfStudent = lastName;
        this.ageOfStudent = age;
        this.genderOfStudent = gender;
        this.deptOfStudent = dept;
        this.yearOfStudent = yearOfStudy;
    }


    /**
     * @return id of Student
     */
    public Integer getId() {
        return idOfStudent;
    }

    /**
     * @return firstName of Student
     */
    public String getFirstName() {
        return firstNameOfStudent;
    }

    /**
     * @return lastName of Student
     */
    public String getLastName() {
        return lastNameOfStudent;
    }

    /**
     * @return age of Student
     */
    public int getAge() {
        return ageOfStudent;
    }

    /**
     * @return gender of Student
     */
    public String getGender() {
        return genderOfStudent;
    }

    /**
     * @return department of Student
     */
    public String getDept() {
        return deptOfStudent;
    }

    /**
     * @return year of Student
     */
    public int getYear() {
        return yearOfStudent;
    }

    @Override
    public String toString() {
        return "Student [ id = " + idOfStudent
                + ", firstName = " + firstNameOfStudent
                + ", lastName = " + lastNameOfStudent
                + ", age = " + ageOfStudent
                + ", gender = " + genderOfStudent
                + ", dept = " + deptOfStudent
                + ", year = " + yearOfStudent + "]";
    }


}
