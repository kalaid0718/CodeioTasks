
public class Palindrome {
	public static void main(String[] args) {
		int n = 1221;
		int original = n;
		int rev = 0;
		System.out.println("To check the Palindrome in array");
		//Loop
//		while(n!=0) {
//		int digit = n % 10; //to get lastnumber
//		rev = rev * 10 + digit; //build reverse number
//		n = n / 10;
//		}
		for(int temp = n; temp!=0 ; temp=temp/10) {
			int digit = temp%10;
			rev = rev*10+digit;
		}
		if(rev == original) {
			System.out.println("The Array is has Palindrome Number:" + rev);
		}
		else {
			System.out.println("The is NOT a palindrome");
		}
		
	}
		

}
