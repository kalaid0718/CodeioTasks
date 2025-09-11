
public class GradeCalculator {
	public static void main(String[] args) {
		int marks;
		marks=40;
		if(marks>=90) {
			System.out.println("Grade A");
		}
		else if(marks>=75 && marks<=89) {
			System.out.println("Grade B");
		}
		else if(marks>=50 && marks<=74){
			System.out.println("Grade C");
			
		}
		else {
			System.out.println("Fail");
		}
	}

}
