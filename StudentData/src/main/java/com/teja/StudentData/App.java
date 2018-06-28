package com.teja.StudentData;


import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


/**
 * Read Data from CSV File.
 *
 */

public final class App {

    /**
     *
     * Contsructor.
     */
    private App() {

    }

    /**
     * @param args Input
     */
    public static void main(final String[] args) {

        String fileName =
                  "F:/Maven/Teja_Maven/StudentData/"
                  + "src/main/java/com/teja/StudentData/data.txt";

        ArrayList<Student> studentData = App.readData(fileName);

        /*for (Student student : studentData) {
            System.out.println(student);
        }*/

        System.out.println("Enter your options \n 1.Search \n 2.Sort");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        switch (option) {
            case 1: Search search = new Search(studentData);
                    search.driver();
                    break;
            case 2: Sort sort = new Sort(studentData);
                    sort.driver();
                    break;
            default: System.out.println("Invalid Choice");
        }

    }

    /**
     * @param fileName Name of file to read Data.
     * @return students arraylist.
     */
    private static ArrayList<Student> readData(final String fileName) {

        ArrayList<Student> students = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);

        // create an instance of BufferedReader
        // using try with resource, Java 7 feature to close resources
        try (BufferedReader br  = Files.newBufferedReader(pathToFile,
                 StandardCharsets.US_ASCII)) {
            // read the first line from the text file.
            String line = br.readLine();

            // loop until all lines are read
            while (line != null) {
                String[] attributes = line.split(",");
                Student student = App.createStudent(attributes);
                students.add(student);
                line = br.readLine();
            }
        } catch (IOException ioe) {
               ioe.printStackTrace();
        }

        return students;
    }

    /**
     * @param metadata Input to create student
     * @return student object
     */
    private static Student createStudent(final String[] metadata) {

        int index = 0;
        int id = Integer.parseInt(metadata[index++]);
        String firstName = metadata[index++];
        String lastName = metadata[index++];
        int age = Integer.parseInt(metadata[index++]);
        String gender = metadata[index++];
        String dept = metadata[index++];
        int yearOfStudy = Integer.parseInt(metadata[index++]);

        // create and return book of this metadata.
        return new Student(id, firstName, lastName,
                           age, gender, dept, yearOfStudy);
    }


}
