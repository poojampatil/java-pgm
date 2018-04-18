package com.niit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class pgm1
{
	public static int validateJavaDate(String strDate){
	if(strDate.trim().equals(""))
	{
		return 1;
	}
	else
	{
		SimpleDateFormat sdfrmt = new SimpleDateFormat("dd/mm/yyy");
		sdfrmt.setLenient(false);;
		try
		{
			Date JavaDate = sdfrmt.parse(strDate);
			System.out.println(strDate+"Is valid Date Formate");
		}
		catch(ParseException e)
		{
			System.out.println(strDate+"Is Invalid date Formate");
			return -1;
		}
		return 1;
	}
	}
public static void main(String args[])	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the date is this for dd/mm/yyyy");
	String date =sc.next();
	validateJavaDate(date);
}
}





