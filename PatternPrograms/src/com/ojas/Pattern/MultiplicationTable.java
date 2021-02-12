package com.ojas.Pattern;

import java.util.Scanner;

public class MultiplicationTable {

	    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter upto range Of tables: ");
	    int num = sc.nextInt();
	    for(int outer=1;outer<=num;outer++)
	    {
	        for(int inner=1;inner<=10;inner++)
	        {
	            System.out.println(outer+" x "+inner+" = "+(outer*inner));
	        }
	        System.out.println();
	    }
	    sc.close();
	    }

	 

	}

