package com.niit;

import java.util.*;
public class java10{
	public static String retrieveMaxScoredStudent(String[] s1){
		Map m1=new HashMap();
		for(int i=0;i<s1.length;i++){
			String s2=s1[i];	
			StringTokenizer t=new StringTokenizer(s2,"#");
			String s3=t.nextToken();
			int n1=Integer.parseInt(t.nextToken());
			int n2=Integer.parseInt(t.nextToken());
			int n3=Integer.parseInt(t.nextToken());
			int n=n1+n2+n3;
			m1.put(s3, n);
			}
		//System.out.println(m1);
		int max=0;
		String m=new String();
Set set=m1.keySet();
		Iterator i=set.iterator();
		while(i.hasNext()){
			String s4=(String) i.next();
			int j=(int) m1.get(s4);
			if(j>max){
				max=j;
				m=s4; }
		}
		return m;
	}
	public static void main(String[] args) {
		String[] s1={"arun#12#12#12","deepak#13#12#12"};
		System.out.println(retrieveMaxScoredStudent(s1));
	}
}