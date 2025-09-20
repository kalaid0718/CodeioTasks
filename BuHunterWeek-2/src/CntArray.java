
public class CntArray {
	public static void main(String[] args) {
		int [] arr = {5,-3,0,12,-9,0,7};
		int positive=0 , negative =0 , zero=0;
		for(int i : arr) {
			if(i>0) {
				positive++;
				
			}
			else if(i<0) {
				negative++;
			}
			else {
				zero++;
			}
		}
		
		System.out.println("The count of Positive Numbers are:" + positive);
		System.out.println("The count of Negative Numbers are:" + negative);
		System.out.println("The count of Zero's  are:" + zero);
		
		
		System.out.println("\n The Positive Numbers are:");
		for(int i : arr ) {
			if(i>0) {
				System.out.print(i+" ");
				
			}
		}
		System.out.println("\n The Negative Numbers are:");
		for(int i : arr) {
			if(i<0) {
				System.out.print(  i +" ");
			}
		}
		System.out.println(" \nThe Zeros:");
		for(int i: arr) {
			if(i==0) {
				System.out.print(i + " ");
			}
		}
		 

		
	}

}
