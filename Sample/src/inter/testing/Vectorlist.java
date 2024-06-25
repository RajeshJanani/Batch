package inter.testing;

import java.util.*;

public class Vectorlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v=new Vector<>();  
		v.add("Ayush");  
		v.add("Amit");  
		v.add("Ashish");  
		v.add("Garima");  
		Iterator<String> itr=v.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next()); 
				String rem = v.remove(2);
				System.out.println(rem);
		}  
	}

}
