package core_javaPractice;



public class ReverseEachWordinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "Jayanth harsha";
		String[] words = str.split(" ");
		String reverse ="";
		
		for (String w:words) {
			String reverseword ="";
			
			for(int i=w.length()-1;i>=0;i--) {
				reverseword = reverseword+w.charAt(i);
			}
			reverse = reverse+reverseword+" ";
			
		}
		System.out.println(reverse);

	}

}
