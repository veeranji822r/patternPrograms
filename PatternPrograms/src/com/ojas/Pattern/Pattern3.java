package com.ojas.Pattern;

public class Pattern3 {

	public static void main(String[] args) {
		int num = 5;
		for(int row=num;row>=1;row--)
		{
			for(int col=num;col>=1;col--)
			{
				System.out.print(row+" ");
			}
			System.out.println();
		}

	}

}
