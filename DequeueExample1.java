package collectionExample.QueueEx;
import java.util.ArrayDeque;
import java.util.Deque;
public class DequeueExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque<String> dq = new ArrayDeque<String>();

		dq.add("Rose");
		dq.add("Lily");
		
		System.out.println(dq);
		
		dq.addFirst("Tulip");
		System.out.println("\nAfter adding at 1st position : \n" + dq);
		
		dq.addLast("Lotus");
		System.out.println("\nAfter adding at last position : \n" + dq);
		
		dq.remove();
		System.out.println("\nAfter Deleting the element : \n" + dq);
	}

}
