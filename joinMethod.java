package multiThreading;

public class joinMethod extends Thread
{
	
	public void run(){
		
		String name=Thread.currentThread().getName();
		for(int i=1; i<=20;i++) {
			System.out.print(name+i);
		}
	}
	public static void main(String[] args) throws InterruptedException
	{
		
		joinMethod t1= new joinMethod();
		joinMethod t2= new joinMethod();
		joinMethod t3= new joinMethod();
		
		
		t1.setName("T_");
		t2.setName("#_");
		t3.setName("TTT_");
		
		
				
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t1.start();

		t3.start();
		for (int i = 1; i <= 10; i++)
		{
			Thread.interrupted();
			System.out.print("_MT+"+i);
		}
	}

}
