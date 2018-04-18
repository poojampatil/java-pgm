package com.niit;

public class java3 {
	 public static void main(String[] args) {
	        System.out.println(maxDiff(new int[] {2,4,6,8,10,14}));
	    }

	    private static int maxDiff(int[] array) {
	        int diff = 0;
	        int result = 0;
	        for (int i = 0; i < array.length;i++) {
	            
	            diff = array[i+1] - array[i];
	            if (result < diff)
	                result = diff;
	            i++;
	        }
	        return result;
	     }

	
}
