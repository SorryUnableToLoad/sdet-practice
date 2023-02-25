package javaPrectice.java_basic_program;

import java.util.Arrays;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };
		// get the array's length
		int n = arr.length;

		// the actual size is `n+1` since a number is missing from the array
		int m = n + 1;

		// get a sum of integers between 1 and `n+1`
		int total = m * (m + 1) / 2;

		// get an actual sum of integers in the array
		int sum = Arrays.stream(arr).sum();

		System.out.println(total - sum);

		{
	        int len=arr.length;
	        int sum1=((len+1)*(len+2))/2;
	        for(int i=0;i<len;i++)
	          sum1=sum1-arr[i];
	       System.out.println(sum1);
	    }
	}

}
