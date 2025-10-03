class Remotes{
	void powerOn() {
		System.out.println("Turning Device On ");
	}
}
class TvRemo extends Remotes{
	@Override
	void powerOn() {
		System.out.println("Turning Tv On");
	}
}
class AcRemo extends Remotes{
	@Override
	void powerOn() {
		System.out.println("Turning Ac On");	
	}
}
public class OverRide {
	public static void main(String[] args) {
		Remotes r = new TvRemo();
		r.powerOn();
		r = new AcRemo();
		r.powerOn();
	}

}
