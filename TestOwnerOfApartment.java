package com.exercise.pll;

import com.exercise.bll.OwnerOfApartment;

public class TestOwnerOfApartment {

public static void main(String[] args) {
		
		OwnerOfApartment ap1 = new OwnerOfApartment();
		OwnerOfApartment ap2 = new OwnerOfApartment("Ramkrishna Kushwah");
		
		
		System.out.println(ap1);
		System.out.println("*****************************************");
		System.out.println("Owner : "+ap2.getOwner());
		
		//System.out.println("Apartment : "+ap2.getApartment(1));
		
		ap2.setApartment("JP colony khategaon 01", 2);
		ap2.setApartment("Indore", 3);
		ap2.setApartment("Harda", 5);
		ap2.setApartment("jhansi", 7);
		ap2.setApartment("Azad nagar indore", 9);
		
		System.out.println("Apartment : "+ap2.getApartment(2));
		
		System.out.println("Total Apartment : "+ap2.countApartments());
		
		System.out.println("******************************************");
		ap2.reorganizeApartments();//reorganize apartment
		System.out.println("Apartment : "+ap2.getApartment(2));
		System.out.println(ap2);
		
		//System.out.println("Apartment : "+ap2.getApartment(5));
	}
}
