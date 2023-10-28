package multiThreading;

public class MultiThreading extends Thread {

	public void run(){
		for(int i=0; i<1000;i++) {
			//child thread
			
			try {
				System.out.print("$ ");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) throws InterruptedException {
		MultiThreading m= new MultiThreading();
		m.start();
		for(int i=0; i<500;i++) {
			//main thread
			System.out.print(",");
			Thread.sleep(1000);
		}
	}

}
