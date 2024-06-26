package lambdaExpression.Example;


@FunctionalInterface
interface Calculate1
{
	int getSquare(int no);
}

@FunctionalInterface
interface Bank		//give the implementation of functional interface  
{
	void getDeposite(String name, int amount);		//not more then one method
}

public class DemoInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Greeting g1 = ()-> {System.out.println("Simple msg using lambda : \ngood morning");};
		g1.Greet();
		
		Calculate1 cl1 = (int no) -> no*no;
		System.out.println("\nSquare using lambda Argument : " + cl1.getSquare(12));
		
		Bank b1 = (String name, int balance) ->{
			System.out.println("\nHello " + name);
			balance +=2000;
			System.out.println("Your balance is : " + balance);
		};
		
		b1.getDeposite("Dimpal", 5000);
	}

}
