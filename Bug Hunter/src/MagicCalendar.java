
public class MagicCalendar {
	public static void main(String[] args) {
//		int Year;
//		Year=2020;
//			if((Year % 400==0)||(Year % 4==0 && Year%100!=0)) {
//				System.out.println("Leap Year");
//			}
//			else {
//				System.out.println("Not a Leap year");
//			}
		
		int n = 5;
		int fact = 1;
		for(int i = 1; i<=n; i++) {
			fact = fact*i;
		}
		System.out.println("Factorial:" + fact);
	}
	

}
