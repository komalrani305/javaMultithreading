package multiThreading;

class bank extends Thread{
	static double money=100000000.00;
	static double withdrow;
	
	


	 bank(double withdrow){
		this.withdrow=withdrow;
	}
	
	
	 static synchronized void withdrow() {
		String name=Thread.currentThread().getName();
		if(withdrow<=money) {
			System.out.println(name+" debited money");
			System.out.println(money=money-withdrow);
		}else {
			System.out.println("buddy earn more to spent more");
		}
		
	}
	
	public void run() {
		withdrow();
	}

	
}
public class staticSynchronize {

	public static void main(String[] args) {
		bank b1=new bank(500.00);
		Thread t1=new Thread(b1);
		Thread t2=new Thread(b1);
		
		t1.setName("komal");
		t2.setName("Rani");
		
		
		bank b2=new bank(50000000.00);
		Thread t3=new Thread(b2);
		Thread t4=new Thread(b2);
		
		t3.setName("dad");
		t4.setName("mom");
		
	t1.start();t2.start();
		t3.start();t4.start();

	}

}
