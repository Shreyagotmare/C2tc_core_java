package com.tns.java;

import java.util.Scanner;

public class Decision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.out.println("Enter the value of x =  ");
		Scanner s= new Scanner(System.in);
		int x = s.nextInt();
		
        if(x != 5)
        {
      	  System.out.println("Value of x is not 5");
      	  
        }
        else
        {
        System.out.println("Value of x is 5");
        }

	}

}
