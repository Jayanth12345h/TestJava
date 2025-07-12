package core_javaPractice;

public class SecondLargestNumber {

	public static void main(String[] args) {

		int[] array = new int[]{1,7,8,9,12,21};
		int temp, size;
		size = array.length;
		
		for(int i =0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(array[i]>array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j]=temp;
					
				}
				
			}
			
			
		}
		System.out.println("second largest element on the array:"+array[size-2]);
		
		System.out.println("second smallest element on the array:"+array[1]);
	}

}
