package core_javaPractice;

class a{
	String s = "jayanth";
}

class b extends a{
	String s = "jayanth harsha";
	void k() {
		System.out.println(s);
		System.out.println(this.s);
		System.out.println(super.s);
		
	}
}
public class This_SuperKeywords {

	
	
	public static void main(String[] args) {

		b test = new b();
		test.k();
	}

}
