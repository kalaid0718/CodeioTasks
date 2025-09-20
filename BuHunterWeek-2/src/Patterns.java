
public class Patterns {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
		
		
		
		for(int i=1;i<=5;i++) {
			boolean value=true;
				if(i%2==0) {
					value=false;
				}
				for(int j=1;j<=i;j++) {
				if(value) {
					System.out.print(1);
				}
				else {
					
					System.out.print(0);
					value=!value;
				}
				
			System.out.println();
		}
		}
		int n=3;
		
		for(int i=1;i<=3;i++) {
			for(int j=n;j>i;j--) {
				System.out.print("X");
			}
			
			System.out.println();
		}
	}

}
