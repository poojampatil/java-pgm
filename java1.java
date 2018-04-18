package com.niit;
import java.util.Scanner;


public class java1 {
	

	public static void main(String[] args)
	{
		int sum=0;
	Scanner	s = new  Scanner(System.in);
	        System.out.print("Enter the number :");
	     int n = s.nextInt();
	       while(n>0){
	    	   int rem =n%10;
	    	   if(rem%2!=0)
	    	   {
	    		   sum=sum+rem;
	    		   
	    	   }
	    	   n=n/10;
	       }
	       if(sum%2==0)
	       {
	        System.out.println("Sum of odd digits is even");
	       }
	       else
	       {
	        
	        System.out.println("Sum of odd digits is odd");
	       }
	}
	

}
