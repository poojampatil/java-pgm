package com.niit;
import java.text.*;
import java.time.Month;
import java.util.*;

public class java8 {

	public static String monthDiff(Date d1){
		SimpleDateFormat sdf=new SimpleDateFormat("MMMM");
		String s=(sdf.format(d1));
		return s;
	}
	public static void main(String[] args) {
		Date d1=new Date(23/01/2012);
		System.out.println(monthDiff(d1));
	}
}

