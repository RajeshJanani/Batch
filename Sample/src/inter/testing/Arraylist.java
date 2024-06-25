package inter.testing;

import java.util.ArrayList;
import java.util.Iterator;
// import java.util.*;
public class Arraylist {

	public static void main(String[] args) {
		
ArrayList<String> list = new ArrayList<>(); //SYNTAX  ArrayList<data type> Listname = new ArrayList<data type>();

list.add("Janani");
list.add("Hari");
list.add("Rajesh");
list.add("Hari");
list.add("dharshan");
//System.out.println(list);

// For(String value : list)
//System.out.println(value);

Iterator<String> itr =list.iterator(); // Iterator <data type> object = arraylistobj.iterator();

while(itr.hasNext())
{
	System.out.println(itr.next());
}
System.out.println();
String rem = list.remove(3);
System.out.println("Removed Element : " + rem);

	}

}
