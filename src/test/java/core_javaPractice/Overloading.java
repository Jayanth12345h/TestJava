package core_javaPractice;

public class Overloading {


	public int add(int x , int y) {
		return x+y;

	}

	public int add(int x, int y, int z) {

		return x+y+z;
	}
	public static void main(String[] args) {


		Overloading test = new Overloading();
		int add = test.add(10,20,30);
		//int add1 = test.add(10, 20,30);
		System.out.println("The sum of x, y, and z is: "+add);
		

	}

}
