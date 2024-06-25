package inter.testing;
//import java.util.*;
import java.util.LinkedList;
public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create linkedlist
	    LinkedList<String> animals = new LinkedList<String>();

	    // Add elements to LinkedList
	    animals.add("Dog");
	    animals.add("Cat");
	    animals.add("Cow");
	    System.out.println("LinkedList: " + animals);
	    
	    animals.add(2, "Horse");
	    animals.add(4, "Deer");
	    System.out.println("LinkedList: " + animals);
	    
	}

}
