package com.tns.java;

import java.util.Scanner;

public class Whiledo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Enter the value of i =  ");
			Scanner s= new Scanner(System.in);
			int i = s.nextInt();
		do
		{
			System.out.println(i);
			i++;
		}while(i<=1);
	}

	}


