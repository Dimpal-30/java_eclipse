package first1;

public class Firstclass {
	
	public static void main(String[] args)
	{
		int no1,no2;
		no1=120;
		no2=34;
		int sum=no1+no2;
		System.out.println("addition = "+sum);
		
		int sub=no1-no2;
		System.out.println("subtraction = "+sub);
		
		int multy=no1*no2;
		System.out.println("multiplication "+multy);
		
		float div=no1/no2;
		System.out.println("Division "+div);
		
		Student s=new Student();
		s.setrollno(10);	
		System.out.println("Rollno is : "+s.getrollno());
		
	}

}
