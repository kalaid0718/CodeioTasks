
public class arrayFrequency {
	public static void main (String[] args) {
		int []arr = {2,4,2,6,2,9,6};
		int n = arr.length;
		//check if visited or not
		boolean visited[] = new boolean[n];
		System.out.println("Element Frequency:");
		
		//Loop(outerLoop)
		for(int i = 0; i < n; i++) {
			if(visited[i]) {
				continue;
			}
			int count = 1;
			
			//innerLoop
			for(int j = i+1; j < n; j++ ) {
				if(arr[i] == arr[j]) {
					count++;
					visited[j] = true;
				}
			}
			
			System.out.println(arr[i] + " appers " + count + " times ");
		}
		
		
	}

}
