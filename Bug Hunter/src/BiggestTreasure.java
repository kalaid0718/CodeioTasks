
public class BiggestTreasure {
	public static void main(String[] args) {
		int a,b,c;
		a=2;
		b=4;
		c=5;
		
		System.out.println("Number a:"+a+"\nNUmber b:"+b+ "\nNumber c:"+c);
		if(a>=b && a>=c) {
			System.out.println("a is the Largest Number:"+a);
		}
		else if(b>=c && b>=a) {
			System.out.println("b is the Largest Number:"+b);
		}
		else {
			System.out.println("c is the Largest Number:"+c);
		}
	}

	

}
