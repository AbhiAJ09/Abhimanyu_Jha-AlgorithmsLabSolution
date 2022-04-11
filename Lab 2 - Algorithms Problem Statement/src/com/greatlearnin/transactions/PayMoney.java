package com.greatlearnin.transactions;

import java.util.Scanner;

public class PayMoney {
	void transactions(int arr[]) {
		
		Scanner aj=new Scanner(System.in);
		
		System.out.println("Enter the total no of targets that needs to be achieved");
		int targetNumber=aj.nextInt();
		
		System.out.println("Enter the value of target");
		int targetValue=aj.nextInt();
		
		int sum=0;
		int i=0;
		for(i=1; i<=targetNumber; i++) {
			sum+=arr[i-1];
			if(sum>=targetValue) {
				break;
			}
		}
		
		
		if(sum>=targetValue) {
			System.out.println("Target achieved after "+ i + " transactions");
		}
		
		
		else {
			System.out.println("Given target is not achieved");
		}
	}
	

}
