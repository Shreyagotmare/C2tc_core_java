package com.tns.generic;

import java.util.*;

public class WildDemo {

	public static void main(String[] args) {
	List<Integer>list1=Arrays.asList(14,45,78,63,89);
	List<Double>list2=Arrays.asList(2.3,4.5,7.8,6.3,8.9);
		printList(list1);
		printList(list2);
		

	}
	public static void printList(List<?>list)
	{
		System.out.println(list);
	}
}
