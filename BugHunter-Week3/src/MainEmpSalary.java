 class Employee{
	 private String name;
	 private int id;
	 private double salary;
	 
	 //Getter and Setter method 
	 //for name
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 
	 // For Id
	 public int getId() {
		 return id;
	 }
	 public void setId(int id) {
		 this.id = id;
	 }
	 
	 //For Salary
	 public double getSalary() {
		 return salary;
	 }
	 public void setSalary(double salary) {
		 if(salary >= 0) {
			 this.salary = salary;
		 }
		 else {
			 System.out.println("Salary cannot be negative");
		 }
	 }
	 
	 //method to display the EMP details
	 public void displayEmployee() {
		 System.out.println("Employee Name: " + name);
		 System.out.println("Employee ID: " + id);
		 System.out.println("Employee Salary: ₹" + salary);
		 System.out.println("-----------------------------------------");
	 }
 }
public class MainEmpSalary {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("Shinchan");
		emp.setId(101);
		emp.setSalary(70000);
		
		emp.displayEmployee();
		
		emp.setSalary(90000);
		System.out.println("After Salary Update:");
		emp.displayEmployee();
	}

}
