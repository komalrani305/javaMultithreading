package multiThreading;


class B extends Thread{
	
	public void run() {
		String name=Thread.currentThread().getName();
		for(int i=1;i<10;i++)
			System.out.print(name);
	}
}
public class suspandResume {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		
		B t1=new B();
		B t2=new B();
		B t3=new B();
		t1.setName("t1");
		t2.setName("T2");
		t3.setName("T3");
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.suspend();
		t1.resume();
	}

}
