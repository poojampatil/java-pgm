package com.niit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class pgm13 {


	public static void main(String[] args)
    {
        int n, a, m = 0, sum = 0;
        Scanner s = new Scanner(System.in);
        int[] a1={10,15,20,25,30,100};
        System.out.println(Arrays.toString(a1));
        System.out.println("Enter any number:");
        n = s.nextInt();
        ArrayList<Integer> a2 =new  ArrayList<Integer>();
        for(int i=0;i<a1.length;i++)
        {
        	if(a1[i]>n)
        	{
        		a2.add(a1[i]);
        	}
        }
        int arrsum=0;
        for(int c:a2){
        	arrsum+=c;
        }
        System.out.println(arrsum);
        do
        {
            a =arrsum % 10;
            m = m * 10 + a;
           
           arrsum=arrsum/10;
        }
        while( arrsum > 0);
        System.out.println("Reverse:"+m);
        //System.out.println("Sum of digits:"+sum);
    }
}


