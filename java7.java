package com.niit;

import java.util.*;
public class java7{
	public static void main(String[] args)
	{
		System.out.println("enter the number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=1,i,count=0,sub;
		for(i=3;i<=n;i=i+2)
		{
			count++;
			if(count==2)
			{
				sub=sum-i;
				sum=sub;
				count=0;
				continue;
				
			}
			sum=sum+i;
		}
	System.out.println(sum);
	}
}

