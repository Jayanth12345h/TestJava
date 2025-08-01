package interviewpractice;

import java.util.Vector;

public class VectorList {

	public static void main(String[] args) {
		// Vectorlist increment with 100%, (like 10, 20, 40)
		Vector v1 = new Vector();
		v1.add("jay");
		v1.add("niha");
		v1.add("ram");

		System.out.println(v1);

		Vector v2 = new Vector();
		v2.add("beem");
		v2.add("Test1");

		v1.addAll(0, v2);
		System.out.println(v1);
		System.out.println("size:" + v1.size());
		System.out.println("capacity:" + v1.capacity());
		
	//	v1.clear(); // it will remove all the data
		System.out.println(v1.containsAll(v2)); // verification of elements

	}

}
