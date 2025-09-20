
public class ArmstrongNumber {
	public static void main(String[] args) {
		int num = 153;
		int ognum = num;
		int result = 0;
		int n = 0;
		
		//count digit
		for(int temp = num ; temp !=0; temp = temp / 10) {
			n++;
		}
		
		// calculate  sum of digit
		for (int temp = num; temp!= 0; temp = temp/10) {
			int digit = temp %10;
			result +=Math.pow(digit,n);
		}
		
		//compare
		if(result == ognum) {
			System.out.println(ognum + " is an Armstrong Number");
		}
		else {
			System.out.println(ognum + " is NOT an Armstrong Number");
		}
	}

}
