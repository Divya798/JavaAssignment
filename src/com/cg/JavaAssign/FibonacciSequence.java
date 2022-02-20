package com.cg.JavaAssign;

import java.util.Scanner;

public class FibonacciSequence {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int a=0,b=1,c;
		System.out.print("Enter a number : ");
		
		int num = s.nextInt();
		System.out.print(b);
		System.out.print(" ");
		for(int i=1;i<=num;i++)
		{
			c = a+b;
			if(c<num)
			{
				System.out.print(c);
				System.out.print(" ");
			}
			else
				break;
			a=b;
			b=c;
		}
		
	}

}