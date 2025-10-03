class Person{
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;		
	}
	void show() {
		System.out.println("Name: " + name + "\nAge" + age);
	}
}

class Students extends Person{
	int marks;
	String grade;
	public Students (String name,int age,int marks, String grade) {
		super (name ,age);
		this.marks = marks;
		this.grade = grade;
		
	}
	@Override 
	void show() {
		super.show();
		System.out.println("Marks:" + marks + "\nGrade:" + grade);
	}
}

class GraduateStudent extends Students{
	String researchtopic;
	public GraduateStudent(String name,int age,int marks,String grade,String researchtopic) {
		super(name,age,marks,grade);
		this.researchtopic = researchtopic;
	}
	@Override
	void show() {
		super.show();
		System.out.println("ResaerchTopic:" + researchtopic);
	}
}
public class StuGrade {
	public static void main(String[] args) {
		GraduateStudent g = new GraduateStudent("Bobby",24,95,"A","FullStack");
		System.out.println("Graduate Students Details:");
		g.show();
	}
	

}
