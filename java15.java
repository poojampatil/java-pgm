package com.niit;


import java.util.*;
class java15 { 
    public static void main(String args[]) 
   
    { 
    	
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        String reverse = "";
        int length = s.length();

        for (int i = length - 1; i >= 0; i--)
        	if(i==0)
            reverse = reverse + s.charAt(i);
        	else
        		reverse = reverse + s.charAt(i)+"-";
        		
        System.out.println("Result:" + reverse); 
    } 
}