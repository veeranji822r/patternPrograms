package com.ojas.Pattern;

public class Pattern8 {

	public static void main(String[] args) {
		int num = 5;
		
		for(int row=1;row<=num;row++)
		{
			int count = row;
			for(int col=1;col<=row;col++)
			{
				System.out.print(count++ +" ");
			}
			System.out.println();
		}

	}

}
