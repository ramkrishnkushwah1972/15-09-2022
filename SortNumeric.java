package com.exercise.bll;

import java.util.Scanner;

public class SortNumeric {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of array :");
		int size= in.nextInt();

		int numarray[]= new int[size];
		
		System.out.println("Enter "+size+" elements :");
		//storing number in array
		for(int i=0; i<size; i++)
			numarray[i]= in.nextInt(); 
		
		//this loop for sort array by ascending order
		for(int i=0; i<numarray.length; i++)
		{
			for(int j=i;j<numarray.length-1; j++)
			{
				if(numarray[i]>numarray[j+1])//sorted by ascending order
				{
					int temp=numarray[i];
					numarray[i]=numarray[j+1];
					numarray[j+1]=temp;
					
				}
			}	
		}
		System.out.print("\nSorted Array by ascending order :");
		for(int i=0; i<numarray.length; i++)
			System.out.print(" "+numarray[i]);
		
		//this loop for sort array by descending order
		for(int i=0; i<numarray.length; i++)
		{
			for(int j=i;j<numarray.length-1; j++)
			{
				if(numarray[i]<numarray[j+1])//sorted by descending order
				{
					int temp=numarray[i];
					numarray[i]=numarray[j+1];
					numarray[j+1]=temp;
					
				}
			}	
		}
		System.out.print("\nSorted array by descending order :");
		for(int i=0; i<numarray.length; i++)
			System.out.print(" "+numarray[i]);
		
		
		in.close();
	}
}
