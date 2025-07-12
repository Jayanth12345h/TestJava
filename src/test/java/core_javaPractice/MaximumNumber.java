package core_javaPractice;

public class MaximumNumber {

	public static void main(String[] args) {

		
		
		
		int arr[] = new int[] {8,4,7,9,3,2,5};
		
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println(min);
	}

}
