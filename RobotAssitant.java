
public class RobotAssitant {
	public static void main(String[] args) {
		int a,b,option;
		a=10;
	    b=5;
	    option=4;
		System.out.println("Enter the Option\n 1->Addition \n 2->Subtraction \n 3->Multiplication \n 4->Divition");
		if(option==1) {
			System.out.println("Addition" +(a+b));
		}
		else if(option==2) {
			System.out.println("Subtraction" +(a-b));
		}
		else if(option==3) {
			System.out.println("Multiplication" +(a*b));
		}
		else if(option==4){
			System.out.println("Division" +(a/b));
		}
		else {
			System.out.println("Enter a vaild data");
			
		}
	}
	

}
