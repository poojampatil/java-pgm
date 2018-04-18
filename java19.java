package com.niit;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class java19{
   public static boolean validateJavaDate(String strDate)
   {
	if (strDate.trim().equals(""))
	{
	    return true;
	}
	else
	{
	    SimpleDateFormat sdfrmt = new SimpleDateFormat("MM/dd/yyyy");
	    sdfrmt.setLenient(false);
	    
	    try
	    {
	        Date javaDate = sdfrmt.parse(strDate); 
	        System.out.println(strDate+" is valid date format");
	    }
	    catch (ParseException e)
	    {
	        System.out.println(strDate+" is Invalid Date format");
	        return false;
	    }
	    return true;
	}
   }
   public static void main(String args[]){
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the Date in this Format MM/dd/yyyy");
	   String date = sc.next();
	validateJavaDate(date);
	/*validateJavaDate("12-29-2016");
	validateJavaDate("12,29,2016");*/
   }
}