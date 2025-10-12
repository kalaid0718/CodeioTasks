
public class reverseNumber {
	public static void main(String[] args) {
//		int n = 12345; 
//		int rev = 0;
//		System.out.println("Original Number:" + n);
//		
//		//loop
////		while(n != 0) {
////			int digit = n % 10; //To get largest number
////			rev = rev * 10 + digit; //To build reverse number
////			n = n / 10 ;   //remove last number
////		}
//		for(int temp = n; temp!=0; temp=temp/10) {
//			int digit = temp%10;
//			rev = rev*10+digit;
//		}
//			System.out.println("The Reversed Numbers:" + rev);	
		
		String n ="Hello";
		String rev = " ";
		//String rev = new StringBuilder(n).reverse().toString();
		for(int i = n.length() -1; i>=0;i--) {
			rev+=n.charAt(i);
		}
		System.out.println("Reversed String: "+ rev);
	}

}
