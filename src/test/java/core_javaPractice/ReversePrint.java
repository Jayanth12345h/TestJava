package core_javaPractice;

public class ReversePrint {

	public static void main(String[] args) {



		String str = "jayanth"; // length = 7 , index starting from =0
		String reverse = "";
		for(int i = str.length()-1;i>=0;i--) {

			reverse=reverse+str.charAt(i);
		}
		System.out.println("original : "+str);

		//displays the reverse string
		System.out.println("Reverse of given string:"+reverse);


	}

}
 