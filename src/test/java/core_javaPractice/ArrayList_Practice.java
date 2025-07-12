package core_javaPractice;

import java.util.*;
import java.util.List;

public class ArrayList_Practice {

	public static void main(String[] args) {

		//ArrayList al =new ArrayList();
		
		List<String> als=new ArrayList<String>();//allows only string type data elements
		
	als.add("jay");
	als.add("harsha");
	als.add("water");
	als.add("john");
	als.add("5");
	
	System.out.println("contents:"+als);
	
	als.remove(0);
	System.out.println("after removal:"+als);
	System.out.println("after removal:"+als.size());
	
	//Iterator it = als.iterator();
	//while(it.hasNext()) {
		//System.out.println(it.hasNext());
	//}
	
	}
	

}
