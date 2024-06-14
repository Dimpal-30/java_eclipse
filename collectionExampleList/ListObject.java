package collectionExampleList;

import java.util.*;

public class ListObject {
	
	public static void main(String[] arg)
	{
		Color c =new Color(1,"Black");
		
		List <Color> lst = new ArrayList<Color>();
		
		lst.add(new Color(2, "Green"));
		lst.add(new Color (3, "Whilte"));
		
		for(Color clr : lst)
		{
			System.out.println(clr);
		}
	}
}
