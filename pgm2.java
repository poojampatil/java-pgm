package com.niit;
import java.util.*;

public class pgm2 {
	public static void main(String[] args){
	System.out.println("Please enter a Firstname , MiddleName & Lastname separated by spaces");
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    System.out.println(name);
    String[] arr = name.split(" ",2);
    System.out.println(arr[1]+","+arr[0].charAt(0));
    
	System.out.println("Persons lastname and firstanme");
}

}
