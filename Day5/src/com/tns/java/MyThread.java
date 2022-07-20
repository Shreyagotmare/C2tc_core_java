//Create a thread using Thread class.

package com.tns.java;

	class ChildThread extends Thread //Thread
	{
		public void run()
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("I am child thread.");

			}
			
		
	}}

	//Tread Scheduler
	
	public class MyThread  {

		public static void main(String[] args) throws InterruptedException
		{
		ChildThread m=new ChildThread();
		 m.start();
		

		for(int i=0;i<10;i++)
		{
			System.out.println("I am main thread.");
		}
		
		}}
		

