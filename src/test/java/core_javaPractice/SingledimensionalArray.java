package core_javaPractice;

import java.util.Arrays;
import java.util.Scanner;

public class SingledimensionalArray {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter the array size:");
		int arrsize = scanner.nextInt();

		int[] arr=new int[arrsize];
		System.out.println("please enter the array values:");
		for(int i=0;i<arrsize;i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("Input: "+Arrays.toString(arr));
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];

		}
		System.out.println("Output:"+sum);
		scanner.close();
	}

}
