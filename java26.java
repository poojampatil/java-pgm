package com.niit;

public class java26 {public static int noOfnonRepeatedCharacters(String s1){
	StringBuffer sb=new StringBuffer(s1);
	int n=0,i;
	for( i=0;i<s1.length();i++)
		for(int j=i+1;j<sb.length();j++)
			if(sb.charAt(i)==sb.charAt(j)){
				sb.deleteCharAt(j);
				n++; }
			if(n>0){
				sb.deleteCharAt(i);
				i--;}		
	return sb.length();
}
public static void main(String[] args)
{
	String s1="preethi";
	System.out.println(noOfnonRepeatedCharacters(s1));
}
}


