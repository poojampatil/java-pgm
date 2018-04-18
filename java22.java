package com.niit;

public class java22{
public static int commonElements(int[] a,int[] b){
	int c=0;
	for(int i=0;i<a.length;i++)
		for(int j=0;j<b.length;j++)
			if(a[i]==b[j])
				c++;
	return (2*c);
}
public static void main(String[] args){
	int a[]={1,2,3,4};
	int b[]={3,4,5,6};
	System.out.println(commonElements(a,b));
}
}