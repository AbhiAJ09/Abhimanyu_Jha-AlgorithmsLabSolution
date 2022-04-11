package com.greatLearning.Travel;

import java.util.Scanner;

public class Denominations {
	void currencyDenomination(int array_Denominations[], int size) {
    	
    	//Sorting the denomination values stored in array_Denominations in decreasing order
    	
		for(int i=size-1; i>=0; i--){
            for (int j=size-1; j>=1; j--){
                if(array_Denominations[j-1]<array_Denominations[j]){
                    int temp=array_Denominations[j-1];
                    array_Denominations[j-1]=array_Denominations[j];
                    array_Denominations[j]=temp;
                }
               
            }
        }
       
        //program to take amount value from user and storing it in amount variable

        Scanner sc=new Scanner(System.in);    
        System.out.println("Enter the amount you want to pay");
        int amount=sc.nextInt();
       
      //creating array counter variable to count no. of denomination currency to be used
        int denomination_counter[]=new int[size];
       
        //program for processing of all the above inputs
        
        //creating two temperory varibles for future cases (to make the program more efficient and interactive according to user input)
        int temp=amount;
        int temp1=temp;
       
      //program code for processing of inputs according to assignment questions no. 2
        for (int i=0; i<size; i++){
        	if(amount >= array_Denominations[i]){
        		denomination_counter[i] = amount / array_Denominations[i];
        		amount = amount - denomination_counter[i] * array_Denominations[i];
        		temp1=amount; //here temp1 value updated with updated amount value which will be used for different test cases 
        		}
        	}
        
        /*program code for exceptional cases:
         * example
         * consider array_Denominations{100, 70, 60, 50} after sorting
         * for amount =280
         * above code will fail for amount 280  
         * on the basis of above code o/p will be 100:2  and  70:1
         * which is not giving denomination of 280 but giving denomination only for 270;
         * to get desire o/p (i.e. 70:4) for exceptional cases like this code is written below
         */
        
        
        if(amount!=0){      //for exceptional cases amount will never be zero
        	System.out.println("Your payment approach in order to give min no of notes will be");
        	for (int i=0; i<size; i++){
        		amount=temp;   //copying original amount to process the code from above created temp variable
        		
        		/*if there will be condition like exceptional case example given above
        		 * 
        		 * then there are chances that 1 or more currency denomination can be separately used for given amount
        		 * consider  example array_Denominations{100, 70, 40, 50};
        		 * for amount 280, currency denomination of 70 can be used 4 times;
        		 * or 
        		 * currency denomination of 40 can be also be used 7 times;
        		 * below codes work for this type of cases
        		 */
        		
        		if((amount%array_Denominations[i])==0){
        			int temp2=amount/array_Denominations[i];
        			denomination_counter[i]=temp2;
        			System.out.println(array_Denominations[i] + " : " + denomination_counter[i]);
        			
        			/*Using of break:
        			 * this will only consider higher denomination currency value 
        			 * i.e. 70 currency will be taken 4 times 
        			 * but considering currency 40 7 times will be ignored if we consider above example
        			 */
        			break; 
        		}
        		
        	}
        	
        }
        
        //printing the outputs
        else{
        	amount=temp1;
        	System.out.println("Your payment approach in order to give min no of notes will be");
        	for(int j=0; j<size; j++){
        		if (denomination_counter[j] != 0) {
        			if(amount==0){
        				System.out.println(array_Denominations[j] + " : " + denomination_counter[j]);
        				}   
        			
        		}
        		
        	}
        	
        }
        
	}
	
}
