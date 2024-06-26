package StreamEamples;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamEample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stream<Integer> numbers = Stream.of(34,67,45,90,1,12,67,78);   //operation on collection of data
		System.out.println("Total " + numbers.count() + " numbers are there in Stream");
	
		Integer[] int1 = {78,0,23,34,12};
		Stream sint;
		
		sint = Arrays.stream(int1).map(k->k*k);
		System.out.println("\nSquare of array :");
		sint.forEach(System.out::println);
	}

}
