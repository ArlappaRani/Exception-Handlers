package com.kodnest.execeptionhandling;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Calculation is started");
		System.out.println("Enter the numerator");
		int a=scan.nextInt();
		System.out.println("Enter the denominator");
		int b=scan.nextInt();
		int c=a/b;
		System.out.println("Division result is"+c);
		System.out.println("Calculation is ended");
		
		

	}

}
