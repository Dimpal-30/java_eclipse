package threadfun_synchronization;

class CounterNo{
	
	int cnt;
	public synchronized void get_Increment() {
		
		cnt++;
	}
}
public class CounterExample {

	public static void main(String[] args) {
			
		CounterNo cn = new CounterNo();
		
		Thread t1 = new Thread(new Runnable ()  {
			
			@Override
			public void run() {
				for(int i=0;i<20;i++)
				{
					cn.get_Increment();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable ()  {
			
			@Override
			public void run() {
				for(int i=0;i<20;i++)
				{
					cn.get_Increment();
				}
			}
		});
			
		t1.start();
		t2.start();
		try 
		{
			t1.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		try 
		{
			t2.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		cn.get_Increment();
		System.out.println(cn.cnt);
		//System.out.println(cn.cnt);

	}

}
