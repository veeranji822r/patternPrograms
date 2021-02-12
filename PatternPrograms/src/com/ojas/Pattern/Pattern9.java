package com.ojas.Pattern;

public class Pattern9 {

	public static void main(String[] args) {
		int num = 5;
		char count = 'A';
		for(int row=1;row<=num;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(count++ +" ");
			}
			System.out.println();
			//count;
		}
	}

}
