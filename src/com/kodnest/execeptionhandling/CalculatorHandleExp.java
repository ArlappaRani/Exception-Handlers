package com.kodnest.execeptionhandling;

import java.util.Scanner;

public class CalculatorHandleExp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Calculation is started");
		try {
		System.out.println("Enter the numerator");
		int a=scan.nextInt();
		System.out.println("Enter the denominator");
		int b=scan.nextInt();
		int c=a/b;
		System.out.println("Division result is"+c);
		}
		catch(Exception e)
		{
			System.out.println("Excerption is handled");
		}
		System.out.println("Calculation is ended");
		
		

	}

}
