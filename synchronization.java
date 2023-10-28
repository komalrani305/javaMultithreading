package multiThreading;


class IRCTC implements Runnable{
	int available=1;
	int seat;
IRCTC(int seat){
	this.seat=seat;
}
	
	public  synchronized void run() {
		String name=Thread.currentThread().getName();
		if(available>=seat) {
		System.out.println(name+" your seat booked");
		available= available -seat;
	}
		else {
		System.out.println("error unavelable ");
	}
	
}
}
public class synchronization {

	public static void main(String[] args) throws InterruptedException {
		
		IRCTC i=new IRCTC(1);
		
		Thread t1=new Thread(i);
		Thread t2=new Thread(i);
		Thread t3=new Thread(i);
		
		t3.setPriority(10);
		t2.setPriority(2);
		t1.setPriority(9);
		
		t1.setName("komal");
		t2.setName("Afreen");
		t3.setName("Abhi");
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
