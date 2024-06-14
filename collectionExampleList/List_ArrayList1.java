package collectionExampleList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
//import java.util.LinkedList;
import java.util.List;
//import java.util.Vector;

public class List_ArrayList1 {

	public static void main(String[] args) {
		
		List l1 = new ArrayList<>(34);  //default size 10
		List<Integer> l2 = new ArrayList<Integer>();
		/*List l2 = new LinkedList<>();
		List l3 = new Vector<>(); */
		
		l1.add(14);
		l1.add("Hye");
		l1.add(45.67);
		l1.add(121234);
		l1.add("LJ");
		l1.add(34);
	
		System.out.println(l1.indexOf(45.67));   //index start from 0
		
		System.out.println(l1);
		
		l2.add(12);
		l2.add(89);
		l2.add(45);
		System.out.println(l2);
		
		Integer i = new Integer(12);  
		boolean b = l1.contains(i);  //it will check value & datatype present in l1 or not 
		System.out.println(b);

		System.out.println("Number of ele in List 1 : " + l1.size());  //how many ele are there in list
		
		System.out.println(b);
		
		//1 way [for each loop ]
		for(int k :l2)
			System.out.println("List 2 ele :" +k);
		
		System.out.println("\nList 2....");
		
		for(Object k :l1)	//if we have mix data then usw Object instead of particular datatype 
			System.out.println("List 1 ele :" +k);
		
		//2 way to print [ Iterator object ]
		
		System.out.println("\nlist 2 using Iterator ..");
		Iterator it1 = l2.iterator();
		while(it1.hasNext()) {
			
			Integer in = Integer.parseInt(it1.next().toString());   //for multiplication
			System.out.println(in*100);
			System.out.println(it1.next());
			
			Collections.sort(l2);
			System.out.println(l2);
			
			l1.remove(2);
			System.out.println(l1);
		}
	}

}
