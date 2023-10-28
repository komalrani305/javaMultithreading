package multiThreading;


class interrupt extends Thread{
public void run()
{
	try {
		for (int i = 0; i < 11; i++) 
			Thread.sleep(1000);
			System.out.println("interrupted method");
		
	} catch (InterruptedException e) {
		System.out.println("catched interrupted method");
}
}
}
public class interruptMethod {

	public static void main(String[] args) {
		interrupt i=new interrupt();
		interrupt i2=new interrupt();
		i.interrupt();
		i.start();
		//i2.start();
		//i.interrupt();
		//i2.interrupt();
	}
}

