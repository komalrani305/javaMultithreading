package multiThreading;


class P extends Thread{
	public void run() {
		
		
		for (int i = 0; i < 16; i++) {
			System.out.print(Thread.currentThread().getPriority());
			System.out.print(Thread.currentThread().getName());
		}
	}
}
public class setGetPriority {

	public static void main(String[] args) {
		P p1=new P();
		P p2=new P();
		P p3=new P();
		p1.setName("p");p1.setPriority(1);
		p2.setName("pp");p2.setPriority(10);
		p3.setName("ppp");p3.setPriority(2);
		
		p1.start();
		p2.start();
		p3.start();

	}

}
