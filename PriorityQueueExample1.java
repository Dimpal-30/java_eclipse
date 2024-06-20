package collectionExample.QueueEx;
import java.util.*;

public class PriorityQueueExample1 {

	public static void main(String[] args) {
		
		Queue<Integer> pq1 = new PriorityQueue<Integer>();
		
		pq1.add(21);  //if we adding more then size it will give error
		pq1.offer(1);// ''' .... it will return null value
		pq1.add(45);
		
		pq1.forEach(i -> System.out.println(i));
		
		System.out.println("Removing the Num :" + pq1.remove(45));
		System.out.println("\nAfter removing the num :");
		System.out.println(pq1);
	}

}
