
public class EvenIndex {
	public static void main(String[] args) {
		int [] arr = {10,20,30,40,50,60}; 
		System.out.println("Elements at Even index position:");
		for(int i = 0; i < arr.length; i++) {
			if(i % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
		
	}

}
