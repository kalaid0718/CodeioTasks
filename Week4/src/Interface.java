//Interface+Interface = extends
//Interface+class = Implements
//class+class =extends
interface  car{
	void drive();//interface kulla irruka method public class
	
}
interface Ecar extends car{
	void batteryHealth();
}
interface  PetrolCar extends car{
	void fuelLeft();
}
class Hybridcar implements Ecar , PetrolCar{
	@Override
	public void drive() {
		System.out.println("Driving a Hybrid car");
	}
	@Override
	public void batteryHealth() {
		System.out.println("90% extended batter");
		
	}
	@Override
	public void fuelLeft() {
		System.out.println("50% fuel left");
	}
	
}
public class Interface {
	public static void main(String [] args) {
		
	}

}
