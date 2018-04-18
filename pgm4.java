package com.niit;

public class pgm4 { static int Series(int n)
{
    int i;
    int sums = 0;
    for (i = 1; i <= n; i++)
        sums += (i * i);
    return sums;
}

// Driver Code
public static void main(String[] args)
{
    int n = 3;
    int res = Series(n);
    System.out.println(res);
}


}
