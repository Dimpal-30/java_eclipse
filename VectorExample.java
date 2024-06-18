package collectionExampleList;
import java.util.*;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> vr = new Vector<String>();
		
		vr.add("RED");
		vr.add("YELLO");
		vr.add("GREEN");
		vr.add("BLUE");
		vr.add("BLACK");
		vr.add("WHILTE");
		
		System.out.println("vactor Ex : "+vr);
		
	/*	Iterator ir =vr.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}*/
		
		System.out.println("\nUsing Lambda Expression : \n");
		vr.forEach(i -> System.out.println(i));  //Lambda expression
		
		//ele read every ele of vr & sysout we need to write what we need to print.
		
		vr.remove(1);
		System.out.println("\n After removing color on first index : \n");
		vr.forEach(element -> System.out.println(element)); 
	}

}
