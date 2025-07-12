package core_javaPractice;

public class MissingNumber {

	public static void main(String[] args) {

		int[] array = {1,2,3,4,6}; 

		int sum1 = 0;
		for(int i = 0;i<array.length;i++) {
			sum1 = sum1+array[i];
		}
		System.out.println("sum of length:"+sum1);

		int sum2=0;
		for(int i=1;i<=6;i++) {
			sum2= sum2+i;
		}
		
			System.out.println("sum2 :"+sum2);


			System.out.println("missing number:"+(sum2-sum1));
		

	}
}