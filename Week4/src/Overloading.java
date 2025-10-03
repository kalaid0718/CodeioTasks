
public class Overloading {
	static int display(int n) {
		return n;
	}
	static double display(double n) {
		return n;
	}
	static float display(float n) {
		return n;
	}
	static String display(String n) {
		return n;
	}
	public static void main (String[] args) {
		System.out.println("Integer:"+(display( 4)));
		System.out.println("double:"+(display(5.9)));
		System.out.println("Float:"+(display(5.9)));
		System.out.println("String:" +(display("Ram")));
	}

}
