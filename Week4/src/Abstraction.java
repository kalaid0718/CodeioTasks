// To follow the certain rules the abstraction class will be used
abstract class Remotess{
	abstract void turnOn(); // abstract class does not contain a body 
	//abstract void turnOff();//like rules
	//abstract void charge();
}
class TvRemoo extends Remotess{
	@Override
	void turnOn() {
		System.out.println("Turning Tv On");
	}
}
class AcRemoo extends Remotess{
	@Override
	void turnOn() {
		System.out.println("Turning Ac On");	
	}
}


public class Abstraction {
	public static void main(String[] args) {
		//Remotes r1 = new Remotes(); In Abstarct class we can't create a object it will raise a error
		Remotess r = new TvRemoo();
		r.turnOn();
		r = new AcRemoo();
		r.turnOn();
	}

}
