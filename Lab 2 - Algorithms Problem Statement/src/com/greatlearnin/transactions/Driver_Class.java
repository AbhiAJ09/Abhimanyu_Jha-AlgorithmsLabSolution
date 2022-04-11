package com.greatlearnin.transactions;

import java.util.Scanner;

public class Driver_Class {
	public static void main(String [] arg) {
		
		//Printing intructions, getting inputs and storing in respective variables
		
		System.out.println("Enter the size of transaction array");
		Scanner aj=new Scanner(System.in);
		int size=aj.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter the values of array");
		
		for (int i=0; i<size; i++) {
			arr[i]=aj.nextInt();
		}
		
		//creating object 
		PayMoney obj=new PayMoney();
		obj.transactions(arr);
	}

}
