package setExamples;
import java.util.TreeSet;
import collectionExampleList.Color;

public class TreeExample1 {

	public static void main(String[] args) {
		
		TreeSet<String> tr1 = new TreeSet<String>();
		TreeSet<Integer> tr2 = new TreeSet<Integer>();
		TreeSet<Color> tc1 = new TreeSet<Color>();
		
		tr1.add("Peacook");
		tr1.add("Sparrow");
		tr1.add("Peacook");  // no duplicate | no sequence  
		
		tr1.forEach(i -> System.out.println(i));
		
		tr2.add(6);
		tr2.add(12);
		tr2.add(1);
		tr2.add(45);
		tr2.add(89);
		tr2.add(23);
		
		System.out.println("\nIntegre TreeSet :");
		tr2.forEach(i -> System.out.println(i));
	}

}
