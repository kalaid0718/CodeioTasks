class Student {
	String name;
	int rollNumber;
	double marks;
	
	//Constructor
	Student(String name, int rollNumber ,double marks){
		this.name = name;
		this.rollNumber = rollNumber;
		this.marks = marks;
	}
	
	//METHODS TO DISPLAY
	
	void displayDetails(){
		System.out.println("Name: " + name);
		System.out.println("RollNumber: " + rollNumber);
		System.out.println("Marks: " + marks);
		System.out.println("-------------------------------------------------------------");
		
	}
}
public class Mainstud {
	public static void main(String[] args) {
		Student s1 = new Student ("Abi", 101, 92.2);
		Student s2 = new Student("Bala" , 102 ,89.2);
		Student s3 = new Student ("Chandru", 103, 87);
		
		
		//Display
		s1.displayDetails();
		s2.displayDetails();
		s3.displayDetails();
		
	}

}
