class Stu {
	String name;
	int rollNo;
	double marks;
	public Stu(String name, int rollNo, double marks) {
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}
	public Stu(Stu other) {
		this.name = other.name;
		this.rollNo = other.rollNo;
		this.marks = other.marks;
	}
	void display() {
		System.out.println("Name: " + name + "\nRollNo: " + rollNo + "\nMarks: " + marks);
	}
}
public class StuRecord {
	public static void main(String[] args) {
		Stu s1 = new Stu("Bobby",101,89.2);
		Stu s2 = new Stu(s1);
		System.out.println("Original Student:");
		s1.display();
		System.out.println("Copied Student:");
		s2.display();
		
		s1.marks = 98.5;
		System.out.println("\nAfter Modifying s1:");
		s1.display();
		s2.display();
		
	
	}

}
