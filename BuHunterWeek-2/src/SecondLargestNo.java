
public class SecondLargestNo {
	public static void main(String[] args) {
		int [] arr = {14,28,19,33,45,12};
		//check the condition
		if(arr.length<2) {
			System.out.println("The Array must have atleast 2 numbers to identify the second largest number");
		}
		//initialize
		int firstLargest,secondLargest;
		if(arr[0]>arr[1]) {
			firstLargest = arr[0];
			secondLargest = arr[1];
		}
		else {
			firstLargest = arr[1];
			secondLargest = arr[0];
		}
		
		//Loop
		for(int i = 2; i < arr.length ; i++) {
			if(arr[i] > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = arr[i];
			}
			else if(arr[i] > secondLargest && arr[i] !=firstLargest) {
				secondLargest = arr[i];
				
			}
			
		}
		System.out.println("FirstLargest Number :" + firstLargest);
		System.out.println("SecondLargest Number :" + secondLargest);
		
	
	}

}

