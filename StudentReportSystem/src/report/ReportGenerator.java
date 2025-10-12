package report;

import java.util.Scanner;
import student.*;  // Importing all classes from student package

public class ReportGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get student details
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        System.out.print("Enter City: ");
        String city = sc.nextLine();

        System.out.print("Enter State: ");
        String state = sc.nextLine();

        // Create Address object
        Address address = new Address(city, state);

        // Create Student object and pass Address (Aggregation)
        Student student = new Student(name, rollNo, marks, address);

        // Display details
        student.displayStudentDetails();

        sc.close();
    }
}
