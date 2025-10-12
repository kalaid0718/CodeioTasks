 class Remote{
	 String brand;
	int frequency;
    void turnOn() {
		System.out.println("Turning On");
	}
	 
	void details() {
		System.out.println("Remote Brand:" + brand);
		System.out.println("Frequecy:" + frequency + "MHZ");
	}
	
}
class AcRemote extends Remote{
	void turningOn() {
		System.out.println("Ac Remote ON" );
	}
}
public class TvRemote extends Remote {
	void turnTvOn() {
		turnOn();
		System.out.println("Turning Tv On");
	}
	public static void main (String[] args) {
		TvRemote tv = new TvRemote();
		tv.brand = "LG";
		tv.frequency = 38;
		tv.details();
		tv.turnTvOn();
		System.out.println();
		
		AcRemote ac = new AcRemote();
		ac.brand = "Sony";
		ac.frequency = 48;
		ac.turningOn();
		ac.details();
	}
	

}
 
