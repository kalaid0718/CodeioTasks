
public class SpeedLimit {
	public static void main(String[] args) {
		int speed;
		speed=1200;
		System.out.println("The Speed limit is 60km/h");
		if(speed>=60) {
			System.out.println("Your speed is:" +speed +"km/h\n Overspeeding! Payfine");
		}
		else{
			System.out.println("Your Speed is:"+speed+"km/h\n Your are within the speed ;limit");
		}
	}

}
