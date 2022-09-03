package com.tns.java;

import java.util.Scanner;
import java.util.Arrays;

public class BinarySearchAlgo {
	public static void main(String[] args)
	{
		int size;
		System.out.println("Enter the size of array");
		Scanner s= new Scanner(System.in);
		size=s.nextInt();
		int[]arr = new int [size];
		for(int i=0;i<=size;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Array is =");
		{
			for(int i=0;i<=size;i++)
			{
				System.out.println(arr[i]);
			}
			
		}
		Arrays.sort(arr);
		System.out.println("Sorted array is = ");
		for(int i=0;i<=size;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Enter the search key =");
		int key=s.nextInt();
		System.out.println("Value is found at : "+Arrays.binarySearch(arr,key));
	}

}
