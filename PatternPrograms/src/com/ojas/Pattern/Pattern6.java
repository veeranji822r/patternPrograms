package com.ojas.Pattern;

public class Pattern6 {

	public static void main(String[] args) {
		int num = 5;
		int count = 0;
		for(int row=1;row<=num;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(++count+" ");
			}
			System.out.println();
		}
	}

}
