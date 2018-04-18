package com.niit;

import java.util.*;
public class java16 {
	public static int averageOfMarks(Map<Integer,Integer> m1){
		int n=0,c=0;
		Iterator<Integer> i=m1.keySet().iterator();
		while(i.hasNext()){
			Integer b=i.next();
			if(b%2!=0){
				c++;
				n+=m1.get(b);} }
		return (n/c);	
	}
	public static void main(String[] args) {
		Map<Integer,Integer> m1=new HashMap<Integer,Integer>();
		m1.put(28, 89);
		m1.put(37, 98);
		m1.put(36, 92);
		m1.put(35, 74);
		System.out.println(averageOfMarks(m1));
	}
}