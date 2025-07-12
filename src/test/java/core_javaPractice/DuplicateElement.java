package core_javaPractice;

public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr = new int[] {1,2,3,1,3,5,6,8};
		//System.out.println("Duplicate elements");
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j])
					System.out.println(arr[i]);
			}
		}
	}

}
