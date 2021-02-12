package com.ojas.Pattern;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of prime numbers:");
        int range = sc.nextInt();
            int i =0;
            int num =0;
            String  primeNumbers = "";
            for (i = 1; i <= range; i++)         
            { 		  	  
               int counter=0; 	  
               for(num =i; num>=1; num--)
               {
                  if(i % num == 0)
                  {
                	  counter += 1;
                  }
               }
               if (counter ==2)
               {
	     	     primeNumbers += i + " ";
               }	
            }	
            System.out.println("Prime numbers from 1 to 100 are :");
            System.out.println(primeNumbers);
        }

}
