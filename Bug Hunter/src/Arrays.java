//Array
public class Arrays {
	public static void main(String[] args) {
		/*int [] numbers = {7,18,78,67,9,98};
//		numbers[2]=45;
//		System.out.println(numbers[2]);
		
		//Array iteration
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]+" ");
		}*/
		
		/*int []nums= {1,4,5,3,6,7};
		int sum = 0;//here we can change numbers to double "integer + integer cannot be a double value" so we change the datatype
		for(int i=0; i< nums.length; i++) {
		sum = sum + nums[i];
		}
		double avg = sum / nums.length;// or we can typecast like (double)sum/nums.length
		System.out.println(avg);*/
		
		
		//foreach
		int []nums= {1,4,5,3,6,7};
		int sum = 0;//here we can change numbers to double "integer + integer cannot be a double value" so we change the datatype
		for(int i:nums) {
		sum = sum + i;
		}
		double avg = sum / nums.length;// or we can typecast like (double)sum/nums.length
		System.out.println(avg);
		
	}

}


