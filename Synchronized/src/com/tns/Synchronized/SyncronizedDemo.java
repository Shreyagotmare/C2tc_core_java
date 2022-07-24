//program on Synchronized
package com.tns.Synchronized;

class Counter
{
	int count;
	public synchronized void inc()
	{
		count ++;
	}
}
public class SyncronizedDemo {

	public static void main(String[] args) {
		Counter c = new Counter();
		c.inc();
		System.out.println(c.count);
		
		
	}

}
