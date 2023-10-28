package multiThreading;


class Scheduler extends Thread{
	public void run() {
		String ss=Thread.currentThread().getName();
		for(int i=0;i<30;i++) {
			System.out.print(ss);
		}
		System.out.println();
	}
}
public class ThreadScheduler {

	public static void main(String[] args) {
		
		
		Scheduler s1=new  Scheduler();
		Scheduler s2=new  Scheduler();
		Scheduler s3=new  Scheduler();
		
		s1.setName("you1");
		s2.setName("you2");
		s3.setName("you3");
		
		
		s1.start();
		s2.start();
		s3.start();
		String m=Thread.currentThread().getName();
		for(int i=0;i<30;i++) {
			System.out.print(m);
		}
		System.out.println();

	}

}
