package core_javaPractice;

public class Builder {

	public static void main(String[] args) {



		String input = "jayanth";
		StringBuilder var = new StringBuilder();



		//append is inbuilt method to append the data in stringbuilder
		var.append(input);

		// reverse is inbuilt method in StringBuilder to use reverse the string 

		var.reverse();

		// print reversed String

		System.out.println( "Reversed String  : " +var);
	}

}
