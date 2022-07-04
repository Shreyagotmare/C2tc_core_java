
package com.tns.java;

import java.util.Scanner;

public class Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Enter the value of x =  ");
			Scanner s= new Scanner(System.in);
			int x = s.nextInt();
			x = (10 == x) ? 1 : 0;
		
			System.out.println(x);
	}

}
