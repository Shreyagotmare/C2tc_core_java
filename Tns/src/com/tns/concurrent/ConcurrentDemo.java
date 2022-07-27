package com.tns.concurrent;

	import java.util.concurrent.locks.ReentrantLock;//reentrantLock interface
	
	public class ConcurrentDemo {

		public static void main(String[] args) {
			
			ReentrantLock l=new ReentrantLock(); //object 1
			
			l.lock(); //Lock the thread
			
			System.out.println(l.isLocked()); // Checked whether thread is locked or not.
			
			l.unlock();
			
			System.out.println(l.isHeldByCurrentThread());
			
			
			System.out.println(l.getHoldCount());
			
			
			System.out.println(l.getQueueLength());
			
			
		}

	}

