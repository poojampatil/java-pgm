package com.niit;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class pgm11 {
	public static void main(String[] args){
	String arr[]={"red","blue","green","ivory"};
	System.out.println(Arrays.toString(arr));
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the search string");
	String s=sc.next();
	int c=0;
	Arrays.sort(arr,Collections.reverseOrder());
	for(int i=0;i<arr.length;i++)
	{
	if(s.matches(arr[i]))
	{
		c=i;
	}

}
	System.out.println("reversed array is:");
	System.out.println("position of the given string in a array:"+c);
	System.out.println(Arrays.toString(arr));
	
	}
}