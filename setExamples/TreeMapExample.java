package setExamples;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<String, Integer> courses = new TreeMap<String, Integer>();
				//key, value | key must be unique
		
		courses.put("JAVA", 5000);
		courses.put("C", 4000);
		courses.put("C++", 5000);
		courses.put("JAVA", 5000);  //value can be duplicate but key not
		
		System.out.println(courses);
		
		System.out.println("\nFirst Entry :\n" + courses.firstEntry());
		
	}

}
