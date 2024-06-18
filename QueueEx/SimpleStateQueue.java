package collectionExample.QueueEx;
import java.util.*;
public class SimpleStateQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q1 = new LinkedList<String>();
		
		q1.add("Gujarat");
		q1.add("Rajasthan");
		q1.add("Maharastra");
		q1.add("Karnataka");
		
		System.out.println(q1);
		
		for(String s : q1)
		{
			System.out.println(s);
		}
		
		System.out.println("\nHead Element : "+ q1.peek());
		
		System.out.println("\nDeleting The Head : " + q1.poll());
		
		q1.offer("Tamilnadu");
		System.out.println("\nAfter adding new state : \n" + q1);
		
		System.out.println("\nDequeuing :");
		while(!q1.isEmpty()) {
			System.out.println(q1.poll());
		}
	}

}
