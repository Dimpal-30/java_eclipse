package collectionExampleList;

import java.util.ArrayList;
import java.util.List;

public class EvenTotalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l1 = new ArrayList<Integer>();
		
		int tot=0;
		
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1.add(6);
		l1.add(7);
		l1.add(8);
		l1.add(9);
		l1.add(10);
		
		System.out.println(l1);
		for(int i :l1)
			if(i % 2==0)
			{
				tot +=i;				
			}
		System.out.println("Total of Even Number is : " + tot);
		
		
	}

}
