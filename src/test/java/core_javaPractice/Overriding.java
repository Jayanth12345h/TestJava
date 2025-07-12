package core_javaPractice;


class one{
public void add(int x, int y) {
	System.out.println(x);
}


}

class two extends one{
	
	public void add(int x,int y) {
		System.out.println(x+y); 
		
	}
}



public class Overriding {
	

	public static void main(String[] args) {

		
		two a = new two();
		a.add(10, 20);
		
	}

}
