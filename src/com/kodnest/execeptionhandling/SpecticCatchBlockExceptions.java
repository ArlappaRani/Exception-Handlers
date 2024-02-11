package com.kodnest.execeptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SpecticCatchBlockExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		//specific catch block for handling Arithmetic exception
		catch(ArithmeticException ae)
		{
			System.out.println("Dont enter denominator as 0");
		}
		
		//specific catch block for handling NegativeArraySize exception
		catch(NegativeArraySizeException nae)
		{
			System.out.println("Dont enter negative size of an array");
		}
		
		//specific catch block for handling InputMismatch exception
		catch(InputMismatchException ime)
		{
			System.out.println("Dont enter String value to int variable");
		}
		
		//specific catch block for handling ArrayIndexOutOfBounds Exception exception
		catch(ArrayIndexOutOfBoundsException aioe)
		{			
			System.out.println("Enter the valid index for array");
		}
		
		//Generic catch block for handling other exceptions mentioned above
		catch(Exception e)
		{
			System.out.println("Exception is handled");
		
		}
		finally
		{
			System.out.println("Program execution is ended1");
		}
		

	}

}
