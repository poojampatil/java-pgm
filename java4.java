package com.niit;
import java.util.HashSet;
import java.util.Arrays;
public class java4{
	public static void main(String[] args){
		Integer[] i1={1,2,3,4};
		Integer[] i2={2,3,7,8};
		HashSet<Integer> set1=new HashSet<>(Arrays.asList(i1));
		HashSet<Integer> set2=new HashSet<>(Arrays.asList(i2));
		set1.retainAll(set2);
		System.out.println(set1);
		int sum=0;
		for(int a:set1)
		{
			sum=sum+a;
			
		}
		System.out.println("sum of the elements is :"+sum);
		
		
		
		
	}
	
}


