package com.ojas.Pattern;

public class Pattern17 
{
//	 public static void main(String[] args) {
//		 	int count = 10;
//	        int num = 4;
//	        for(int i=num;i>=1;i--)
//	        {
//	            for(int j=num-1;j>=i;j--) 
//	            {
//	                System.out.print(" ");
//	            }
//	            for(int k=1;k<=i;k++) 
//	            {
//	                System.out.print(count--);
//	            }
//	            System.out.println();
//	        }
//	    }
	public static void main(String[] args) {
        int val=10;
        for(int rows = 1; rows <= 4; rows++){
            for(int columns = 1; columns <= 4; columns++){
                if(rows > columns){
                    
                    
                    System.out.print("   ");
                    }
                else
                {
                    System.out.format("%3d", val);
                    val--;
                }
            }
            System.out.println();
        }

 

    }
}
