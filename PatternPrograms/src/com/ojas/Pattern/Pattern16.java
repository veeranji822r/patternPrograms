package com.ojas.Pattern;

public class Pattern16 {

	public static void main(String[] args) {
//		int num = 4;
//		int number = 0;
//		
//		for(int row=1;row<=num;row++)
//		{
//			String show ="";
//		    for(int space=1;space<=num-row;space++) 
//		    {
//		         System.out.printf(" ");
//		    }
//		    for(int col=1;col<=row;col++) 
//		    {
//		    	number +=1;
//		        show=number+show;
//		    }
//		    System.out.println(show);
//		 }
		   int number = 1, k = 0;
	        for (int rows = 1; rows <= 4; rows++) 
	        {
	            for (int columns = 4; columns >= 1; columns--) 
	            {
	                if (rows >= columns) 
	                {
	                    System.out.print(number + " ");
	                    if (columns != 1)
	                        number--;
	                } 
	                else 
	                {
	                    System.out.print("  ");
	                }
	            }
	            k = k + 2;
	            number = number + k;
	            System.out.println();
	        }
	    }
}
