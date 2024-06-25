package inter.testing;
import java.util.HashSet;
public class Hashset1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> evenNumber = new HashSet<>();  // first

        // Using add() method
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        System.out.println("HashSet: " + evenNumber);

        HashSet<Integer> numbers = new HashSet<>(); //second
        
        // Using addAll() method  - UNION
        numbers.addAll(evenNumber);
        numbers.add(5);
        numbers.add(1);
        System.out.println("New HashSet: " + numbers);
	}

}
