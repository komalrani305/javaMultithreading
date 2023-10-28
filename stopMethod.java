package multiThreading;


class AA extends Thread{
	
	public void run() {
		String name=Thread.currentThread().getName();
		for(int i=1;i<10;i++)
			System.out.print(name);
	}
}
public class stopMethod {

	
	public static void main(String[] args) {
		
AA t1=new AA();
AA t2=new AA();
AA t3=new AA();
t1.setName("T1");
t2.setName("T2");
t3.setName("T3");

t1.start();
t2.start();
t3.start();

//t3.stop();
	}

}
