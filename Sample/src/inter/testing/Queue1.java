package inter.testing;
import java.util.LinkedList;
import java.util.Queue;
public class Queue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<Integer>();

	 // Adds elements {1, 1, 2, 3, 10} to the queue
    for (int i = 1; i < 11; i++)
        q.add(i);

        System.out.println("Elements of queue  "
                       + q);

       int removedele = q.remove();
    System.out.println("removed element-  "
                       + removedele);

    System.out.println(q);

    // To view the head of queue
    int head = q.peek();
    System.out.println("head of queue-  "
                       + head);

        int size = q.size();
    System.out.println("Size of queue-  "
                       + size);
	}

}
