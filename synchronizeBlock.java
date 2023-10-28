package multiThreading;


class home{
	public void bridge(String name) {
		;;;;;;;;;;;;;;;
		//1000 line code
		
		synchronized (this) {
			for (int i = 0; i < 11; i++) {
				System.out.println(name+ " crossing pool");
			}
		}
		
		;;;;;;;;;;;;;;;
		//1000 line code
	}
	
}
class ourThread extends Thread{
	private String name;
private home h;
	ourThread(home h,String name){
		this.name=name;
		this.h=h;
	}
	public void run() {
		h.bridge(name);
	}
}
public class synchronizeBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
home h=new home();
ourThread mt1=new ourThread(h,"komal");
ourThread mt2=new ourThread(h,"rani");
ourThread mt3=new ourThread(h,"afreen");
ourThread mt4=new ourThread(h,"abhi");
mt1.start();mt2.start();
mt3.start();mt4.start();
	}

}
