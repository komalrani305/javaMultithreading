package multiThreading;

class table{
	public synchronized void printTable(int n) {
		for(int i=1;i<11;i++)
			System.out.println(n*i);
	}

}

class t1 extends Thread{
	table tb;
	t1(table tb){
		this.tb=tb;
	}
	public void run() {
		tb.printTable(17);
	}
}

class t2 extends Thread{
	table tb;
	t2(table tb){
		this.tb=tb;
	}
	public void run() {
		tb.printTable(19);
	}
}

public class synchronizeMthod {

	public static void main(String[] args) {
		table tt=new table();
		
		t1 a=new t1(tt);
		t2 b=new t2(tt);
		
		a.start();
		
		b.start();
		
	}

}
