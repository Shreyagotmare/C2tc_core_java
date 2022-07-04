package com.tns.java;

import java.util.Scanner;

public class IFelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Enter the value of x =  ");
			Scanner s= new Scanner(System.in);
			int x = s.nextInt();
		if (x == 10) 
		  { 
		  if (x >= 10) 
		  {
		  	System.out.println("X is greater than 10"); 
		   }
		  else 
		  {
		  System.out.println("X is smaller than 10"); 
		  } 
		 }

		if(x == 10)
		{
			System.out.println("X equals to 10");
		}
		else if(x > 5)
		{
			System.out.println("X is greater to 10");		
		}
		else 
		{
			System.out.println("X is smaller than 10");
		}
		
	}

	}


