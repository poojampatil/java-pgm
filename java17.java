package com.niit;

import java.io.*;

public class java17 {

	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\n enter the number");
		int n=Integer.parseInt(br.readLine());
		int num=0,sum=0;
		while(n!=0)
		{
			num=n%10;
			sum=sum+(num*num);
			n=n/10;
		}
		System.out.println("sum of individual digits"+sum);		
	}

}
