package com.tns.java;

public class StringDemo {

	public static void main(String[] args) {
		String s1= new String("Shreya");
		String s2= new String("Shreya");
		System.out.println(s1==s2);   //Reference comparision
		System.out.println(s1.compareTo(s2)); // 
		System.out.println(s1.equals(s2));  //Content comparison
	}

}
