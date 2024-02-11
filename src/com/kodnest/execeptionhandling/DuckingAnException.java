package com.kodnest.execeptionhandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DuckingAnException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		System.out.println("Enter the String");
		String str=takeInput();
		System.out.println("the string is"+str);
	       }
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static String takeInput() throws Exception//ducking an exception
	{
		
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		String str=br.readLine();//might throw the exception checked exception
		return str;
	}
	

}
