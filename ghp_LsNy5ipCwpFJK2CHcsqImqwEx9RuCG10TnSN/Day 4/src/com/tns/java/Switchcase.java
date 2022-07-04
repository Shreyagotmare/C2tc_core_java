package com.tns.java;

import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		System.out.println("Enter the value of x =  ");
		Scanner s= new Scanner(System.in);
		int x = s.nextInt();
		
		  if (x == 1) 
		  { System.out.println("The value of x is 1"); } 
		  else if 
		  (x== 2) 
		  {
			  System.out.println("The value of x is 2"); } 
		  else if (x == 3)
		  { 
			  System.out.println("The value of x is 3"); } 
		  else 
		  {
		System.out.println("The value of x is other than 1,2,3"); 
		  }
		 
		  System.out.println("Enter the value of y = ");
			Scanner sc= new Scanner(System.in);
			int  y= sc.nextInt();
			
		switch (y) 
		{
		case 1: 
			System.out.println("The value of y is 1");
			break;
		case 2:
			System.out.println("The value of y is 2");
			break;
		case 3:
			System.out.println("The value of y is 3");
			break;
		default:
		System.out.println("The value of y is other than 1,2,3");
			break;

		}

	}

	}


