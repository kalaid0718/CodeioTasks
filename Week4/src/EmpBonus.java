class Emp{
	String name;
	int age;
	double salary;
	
	Emp(String name,int age,int salary){
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
	double getBonus() {
		return 0;
	}
}
class Developer extends Emp{
	Developer(String name,int age,int salary){
		super(name,age,salary);
	}
	@Override
	double getBonus() {
		return salary * 0.20;
	}
}
class Manager extends Emp{
	Manager(String name,int age,int salary){
		super(name,age,salary);
	}
	@Override
	double getBonus() {
		return salary * 0.10;
	}
}
public class EmpBonus {
	public static void main(String [] args) {
		Emp [] e = new Emp[2];
		e[0] = new Developer("Dass",27,27000);
		e[1] = new Manager("Bobby" , 29 , 50000);
		
		for( Emp emp: e)
			System.out.println(emp.name + "Bonus: " + emp.getBonus());
	}

}
