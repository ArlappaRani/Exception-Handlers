package com.kodnest.execeptionhandling;
import java.util.Scanner;
public class BankingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Connection is established with bank server");
		Scanner scan=new Scanner(System.in);
		try 
		{
		
		System.out.println("Enter your pin");
	       int pin=scan.nextInt();
		      if(pin==9999)
		       {
			     System.out.println("Take your money");
		       }
		      else
		       {
			      System.out.println("You entered wrong pin");
		       }
	   }
		catch(Exception e)
		{
			System.out.println("Exception is handled");
		}
		finally {
			System.out.println("Connection is terminated with bank server");
			scan.close();
		}

}
}
