package com.ojas.Pattern;

public class Pattern4 {

	public static void main(String[] args) {
		int num = 5;
		for(int row=1;row<=num;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}

}
