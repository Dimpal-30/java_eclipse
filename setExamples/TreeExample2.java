package setExamples;
import java.util.Scanner;
import java.util.TreeSet;
import collectionExampleList.Color;

public class TreeExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> tr1 = new TreeSet<Integer>();
		Scanner no = new Scanner(System.in);
	
		
		for(int i=0;i<7;i++) {
			
			System.out.println("Enter any num : ");
		
			int n = no.nextInt();
		
			if(n % 5 == 0)
			{
				System.out.println("No is Divisible by 5 : " + n);
			}
		}

	}

}
