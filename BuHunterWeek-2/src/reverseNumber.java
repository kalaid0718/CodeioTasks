
public class reverseNumber {
	public static void main(String[] args) {
		int n = 12345; 
		int rev = 0;
		System.out.println("Original Number:" + n);
		
		//loop
		while(n != 0) {
			int digit = n % 10; //To get largest number
			rev = rev * 10 + digit; //To build reverse number
			n = n / 10 ;   //remove last number
		}
			System.out.println("The Reversed Numbers:" + rev);	
	}

}
