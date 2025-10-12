package student;

public class Student {
    String name;
    int rollNo;
    int marks;
    Address address;  // Has-an Address → Aggregation relationship

    // Constructor
    public Student(String name, int rollNo, int marks, Address address) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
        this.address = address;
    }

    // Method to display all student details
    public void displayStudentDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
        address.displayAddress();  // Calling method of Address class
    }
}

