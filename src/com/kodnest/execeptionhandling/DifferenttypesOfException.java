package com.kodnest.execeptionhandling;
import java.util.Scanner;
public class DifferenttypesOfException {

	public static void main(String[] args) {
		try 
		{
		System.out.println("Program execution is started");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the numerator");
		int a=scan.nextInt();
		System.out.println("Enter the denominator");
		int b=scan.nextInt();
		int c=a/b;
		System.out.println("Division result is"+c);
		System.out.println("Enter the size of an array");
		int size=scan.nextInt();
		//creating an array
		int[]arr=new int[size];
		//storing the element in an array
		System.out.println("Enter the element to be stored");
		int element=scan.nextInt();
		System.out.println("enter the index to store element");
		int index=scan.nextInt();
		arr[index]=element;
		System.out.println("Element is strored in array");
		}
		catch(Exception e)
		{
			System.out.println("Exception is handled");
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Program execution is ended1");
		}
		

	}

}
