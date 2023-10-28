package multiThreading;

import java.util.concurrent.locks.ReentrantLock;

public class RenntrantLock2 {

	public static void main(String[] args) {
	ReentrantLock l=new ReentrantLock();
	l.lock();
	l.lock();
	System.out.println(l.isLocked()+"------------  lock ?");
	System.out.println(l.isHeldByCurrentThread()+"---------- is held by current thread");
	System.out.println(l.isFair()+" ------ fair");
	System.out.println(l.getHoldCount()+"-------- hold count");
	System.out.println(l.getQueueLength()+"----------- q length");
	//System.out.println(l.getWaitQueueLength(null)+" q qait");
	System.out.println(l.getClass()+"---------- class");
	//System.out.println(l.tryLock()+" try lock");
	System.out.println(l.hasQueuedThreads()+"---- has q thread ");
	
	l.unlock();
	System.out.println(l.getHoldCount()+" -------held count after unlock1");
	System.out.println(l.isLocked()+"------- is locked after unlock1");
	
	l.unlock();
	//System.out.println(l.getHoldCount()+" held count after unlock");
	System.out.println(l.isLocked()+"---------- is locked after unlock2");
	System.out.println(l.isFair()+"---------- is fair after unlock2");
	
	
	
	}

}
