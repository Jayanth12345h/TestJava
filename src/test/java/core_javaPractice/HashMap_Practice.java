package core_javaPractice;

import java.util.HashMap;

public class HashMap_Practice {

	public static void main(String[] args) {
	
		HashMap<String,Integer> hm = new HashMap<String, Integer>();
		
		hm.put("jay", 1);
		hm.put("ram", 2);
		hm.put("beem", 3);
		
		
		System.out.println("size of the map is:"+hm.size());
		
		System.out.println("hashmap:"+hm);
		
		if(hm.containsKey("jay")) {
			
			Integer a =hm.get("jay");
			System.out.println("The value is:"+a);
		}
		
		

	}

}
