package com.tns.java;

public class Student {
	String name;
	int roll,age;
	
	
	public Student(String name, int roll, int age) 
	{
		this.name=name;
		this.roll=roll;
		this.age=age;
		
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1= new Student("Shreya",1,29);
		Student s2=new Student("monu",2, 15);
		
		System.out.println(s1.name+" "+ s1.roll+" "+ s1.age);
		
		System.out.println(s2.name+" "+ s2.roll+" "+ s2.age);
		
	
	}}

