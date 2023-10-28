package multiThreading;

public class SleepMethod {

	public static void main(String[] args) throws InterruptedException{
		myThread m=new myThread();
		Thread t= new Thread(m);
		t.start();
		for (int i = 1; i <= 10; i++) {
			Thread.interrupted();
			System.out.print("_MT+"+i);
			
			
		}
	}

}
class myThread implements Runnable{
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.print(" CT\n"+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.getLocalizedMessage();
			}
		}
		
	}
}