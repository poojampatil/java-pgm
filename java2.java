package com.niit;
import java.util.*;
import java.text.*;
class  java2{
   public static void main(String[] args){
     Scanner input=new Scanner(System.in);
     System.out.println("Enter date(1-31):");
     int dd=input.nextInt();
     System.out.println("Enter month(1-12): ");
     int month=input.nextInt()-1;
     System.out.println("Enter year: ");
     int year=input.nextInt();
   Date date= (new GregorianCalendar(year, month, dd)).getTime();
   SimpleDateFormat f = new SimpleDateFormat("EEEE");
     String day=f.format(date);
     System.out.println(day);
     }
}
