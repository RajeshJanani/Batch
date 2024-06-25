package inter.testing;
import java.util.LinkedHashSet;
import java.util.ArrayList;

public class Linkedhash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Creating an arrayList of even numbers
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        System.out.println("ArrayList: " + evenNumbers);

        // Creating a LinkedHashSet from an ArrayList
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>(evenNumbers);
        numbers.add(12);
        System.out.println("LinkedHashSet: " + numbers);
        
	}

}
