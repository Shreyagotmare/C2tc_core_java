package com.tns.java;

import java.util.Scanner;

public class Arri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Enter the value of x =  ");
		Scanner s= new Scanner(System.in);
		int x = s.nextInt();
		
		System.out.println("Enter the value of y = ");
		Scanner sc= new Scanner(System.in);
		int  y= sc.nextInt();
		
		System.out.println(x+y);
		System.out.println(--x);
		System.out.println(++y);

	}

}
