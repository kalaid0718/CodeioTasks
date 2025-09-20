
public class ForLoop {
	public static void main(String[] args) {
		System.out.println("Example for ForLoop");
//		for(int i=1;i>0;i--) {
//			System.out.print(i+" ");
//		}
//		for(int i=5;i<33;i+=3) {
//			System.out.print(i+" ");
//		}
		
		/*int n=5;
		int d=3;
		for (int i=1;i<=10;i++) {
			System.out.print(n+" ");
			n=n+d;
		}*/
		
	//Nested ForLoop
		/*for(int i = 1; i<=5; i++) {
			System.out.print(i+"\t");
			for(int j = 1; j<=5; j++) {
				System.out.println(j+" ");			
			}		
		}	
		int n=0;
		for(int i = 1; i <= 3; i++) {     //outer loop will control the rows
			System.out.print("*");
			for(int j=1; j<=i; j++) {     //innerloop
				System.out.print("*");
			}
			System.out.println(" ");
			
		}
		
		int n=3;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
			
				System.out.print("*");
			
			}
			System.out.println(" ");			
		}*/
		
		int n=3;
		for(int i=3;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		
	}
	
}






