package com.greatLearning.Travel;

import java.util.Scanner;

public class Driver_Class {
	public static void main(String [] arg) {
		//program to take input as currency Denominations of specific currency denomination numbers
	       
        //program for no. of denominations to be created
       
		int size;            
        Scanner sc=new Scanner(System.in);    
        System.out.println("Enter the size of currency denominations");  
       
        //reading the number of denominations that we want to use  
        size=sc.nextInt();  

      //program to store no. of currency denomination values in an array named as array_Denominations
        
        int[] array_Denominations = new int[size];  
        System.out.println("Enter the currency denominations value");
        for(int i=0; i<size; i++){
            array_Denominations[i]=sc.nextInt();  
        }
        
        Denominations obj=new Denominations();
        obj.currencyDenomination(array_Denominations, size);
	}

}