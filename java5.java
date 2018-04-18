package com.niit;
public class java5 {
	public static int[] retrivePosition(int[] a,int[] b)
{
	int[] c=new int[a.length];
	int i;
	for(i=0;i<c.length;i++)
	{
		if(i%2==0)
			c[i]=b[i];
		if(i%2!=0)
			c[i]=a[i];
	}
		return c;
	}
	public static void main(String[] args)
	{
		int[] a={1,2,3,4};
		int[] b={3,4,6,7};
		int[] c=retrivePosition(a,b);

		for(int d:c)
			System.out.println(d);
}
}
