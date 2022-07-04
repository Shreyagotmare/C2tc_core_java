package com.tns.java;

import java.util.Scanner;

public class Forloop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Enter the value of number =  ");
			Scanner s= new Scanner(System.in);
			int number = s.nextInt();
			
		boolean isPrime = true;
		for(int i = 2; i < number/2; i++)
		{
			if(number % i == 0)
			{
				isPrime = false;
			}
		}
		if(isPrime == true)
		{
System.out.println("The number is a prime number");
		}
		else
		{
System.out.println("The number is not a prime number");
		}
		

	}

	

}
