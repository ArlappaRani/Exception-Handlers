package com.kodnest.execeptionhandling;

import java.util.Scanner;

public class HandlingAnException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Calculation is started");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first Number ");
		int a=scan.nextInt();
		System.out.println("ENter the second Number");
		int b=scan.nextInt();
		Multiply(a,b);
		System.out.println("Calculation is ended");

	}
	public static void Multiply(int a,int b)
	{
		System.out.println("Mutiplication is started");
		int c=a*b;
		System.out.println("Multiplication result is:"+c); 
		Divide(a,b);
		System.out.println("Multiplication is ended");
	}
	public static void Divide(int a,int b)
	{
		try {
		System.out.println("Division is stated");
		int c=a/b;
		System.out.println("Division result is:"+c);
		}
		catch(Exception e)
		{
			System.out.println("Exception is handled in the divide method");
		}
		finally {
		System.out.println("Division is ended");
	      }

}
}
