package com.niit;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class pgm8 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        System.out.println("enter the array length");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int j = 0 ; j<=n; j++)
        {
            numbers.add(sc.nextInt());
        }

            for(int i = 0; i < numbers.size();i+=2)
            {
                if(i!= 0)
                
                    numbers.remove(i);
                
               
            }
            System.out.println(numbers);
    }
}

    



