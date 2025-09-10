
public class ReportCard {
	public static void main(String[] args) {
		
		int marks = 97;
		if(marks>=90) {
			System.out.println("The Grade is A");
			
		}
		else if(marks>=70 && marks<90) {
			System.out.println("The Grade is B");
		}
		else if(marks>=50 && marks<75) {
			System.out.println("The Grade is C");
		}
		else{
			System.out.println("The Student is Fail");
		}
	}
	

}
