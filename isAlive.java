package multiThreading;


class a extends Thread{
	
}
public class isAlive {
	
	public static void main(String[] args) {	
a a1=new a();
a a2=new a();
a a3=new a();



System.out.println(a1.isAlive()+" a1");
a1.start();
System.out.println(a1.isAlive()+" a1");
a2.start();
System.out.println(a3.isAlive()+" a3");
a3.start();


	}

}
