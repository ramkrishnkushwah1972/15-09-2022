package com.exercise.bll;

import java.util.Scanner;

public class AverageValueOfArray {


public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter size of array :");
		int size= in.nextInt();
	
		int num[]= new int[size];
		
		System.out.println("Enter "+size+" elements :");
		
		//storing number in array
		for(int i=0; i<size; i++)
			num[i]= in.nextInt();
		
		//sorting array
		for(int i=0; i<size; i++)
		{
			for(int j=i;j<size-1; j++)
			{
				if(num[i]>num[j+1])
				{
					int temp=num[i];
					num[i]=num[j+1];
					num[j+1]=temp;
				}
			}//end inner for loop	
		}//end outer for loop
		

		//this loop for remove largest and smallest number
		for(int i=0; i<size; i++)  
	    {  
	        for (int j=i+1; j<size; j++)  
	        {    
	            if (num[0] == num[j]|| num[size-1] == num[j])  
	            {  
	                for (int k=j; k<size-1; k++)
	                	num[k] = num[k+1];    
		                size--;                 
		                
	            }  
	        }  
	    }
		int sum=0;
		for(int i=1; i<num.length-1; i++)
			sum+=num[i];
		
		System.out.println("Average value of all numbers : "+(double)sum/size);
				
		in.close();
	}
}
