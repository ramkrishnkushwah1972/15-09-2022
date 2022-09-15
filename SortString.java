package com.exercise.bll;

import java.util.Scanner;

public class SortString {

		public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of array :");
		int size= in.nextInt();

		String stringarr[]= new String[size];
		
		System.out.println("Enter "+size+" names :");
		//storing String in array
		for(int i=0; i<size; i++)
			stringarr[i]= in.next();
		
		for(int i=0; i<stringarr.length-1; i++)
		{
			for(int j=i;j<stringarr.length-1; j++)
			{
				if(stringarr[i].compareTo(stringarr[j+1]) > 0)
				{
					String temp=stringarr[i];
					stringarr[i]=stringarr[j+1];
					stringarr[j+1]=temp;
					
				}
			}	
		}//end for
		
		System.out.print("\n Ascending Order  :");
		for(int i=0; i<stringarr.length; i++)
			System.out.print(" "+stringarr[i]);
		
		//this loop for sort array by descending order
		for(int i=0; i<stringarr.length-1; i++)
		{
			for(int j=i;j<stringarr.length-1; j++)
			{
				if(stringarr[i].compareTo(stringarr[j+1]) < 0)
				{
					String temp=stringarr[i];
					stringarr[i]=stringarr[j+1];
					stringarr[j+1]=temp;
					
				}
			}	
		}
		
		System.out.print("\n Descending Order  :");
		for(int i=0; i<stringarr.length; i++)
			System.out.print(" "+stringarr[i]);
	}
}

