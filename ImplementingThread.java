package multiThreading;

class ImplementingThread {

	
	public static void main(String[] args) {
		ChildThread ch = new ChildThread();
		Thread t=new Thread(ch);
		t.start();
	
		for (int i = 0; i < 100; i++) {
			System.out.print("M");
		}

	}
	
}


 class ChildThread implements Runnable{
	public void  run() {
		for (int i = 0; i < 100; i++) {
			System.out.print("#");
		}
	}
	
}