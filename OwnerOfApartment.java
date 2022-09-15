package com.exercise.bll;

public class OwnerOfApartment {

	private String owner; 
	private String[] apartments;

	
	//Defaul constructor
	public OwnerOfApartment() 
	{
		apartments= new String[10];
	}

	//Parameterized constructor
	public OwnerOfApartment(String owner)
	{
		this.owner=owner;
		apartments= new String[10];
	}
	
	public String getOwner()
	{
		return owner; 
	}

	public String getApartment(int slot)
	{
		return apartments[slot];
	}
	
	public void setApartment(String address, int slot)
	{
		this.apartments[slot]=address;
	}
	
	public int countApartments()
	{
		int count=0;
		for(int i=0; i<apartments.length; i++)
		{
			if(apartments[i]!=null)
				count++;
		}
	return count;
	}
	
	public void reorganizeApartments(){
		for(int i=0; i<apartments.length; i++)
		{
			for(int j=i;j<apartments.length-1; j++)
			{
				if(apartments[i]== null)
				{
					String temp=apartments[i];
					apartments[i]=apartments[j+1];
					apartments[j+1]=temp;				
				}
			}	
		}
	}	
	 
	@Override
	public String toString()
	{
		String aprt="";
		
		aprt+="Owner name :" + owner; 
		for(int i=0; i<apartments.length; i++)
		{
			if(apartments[i]!=null)
			aprt += "\nApartments "+i+" : "+apartments[i];
		}
		return aprt;
	}
}
