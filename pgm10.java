package com.niit;

public class pgm10 {
	public static int countOccurances(String str,String m)
	{
		String a[]=str.split(" ");
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(m.equals(a[i]))
				count++;
			
		}
		System.out.println("number of occurance in a string is :");
		return count;
	}
	public static void main(String[] args)
	{
		String str="hi this is cognizant academy";
		String output="hello this is a trainee";
		String sp[]=output.split(" ");
		String m=sp[1];
		System.out.println(countOccurances(str,m));
	}

}
