package com.ojas.Pattern;

public class Pattern13 {

//	public static void main(String[] args) {
//		int num = 5;
//		for(int row=1;row<=num;row++)
//		{
//			for(int space =1;space<=num-row;space++)
//			{
//				System.out.print(" ");
//			}
//			for(int col=1;col<=row;col++)
//			{
//				System.out.print(" *");
//			}
//			System.out.println();
//		}
//
//	}
	public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j >= 5 - i && j <= 3 + i) 
                {
                    System.out.print("*");
                } else
                {
                	 System.out.print(" ");
                }  
            }
            System.out.println();
        }
    }

}
