package collectionExample.QueueEx;
import java.util.*;
public class SimpleQueue {

	public static void main(String[] args) {

		Queue<Integer> q1 = new LinkedList<Integer>();
		
		q1.add(12);
		q1.add(34);
		q1.add(4);
		
		System.out.println(q1);
		
		System.out.println("\n Head Element : "+ q1.peek());
		
		System.out.println("\n Deleting The Head : " + q1.poll());
	}

}
