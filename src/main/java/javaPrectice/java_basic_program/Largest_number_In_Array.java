package javaPrectice.java_basic_program;

import java.util.Arrays;

public class Largest_number_In_Array {
	public static void main(String[] args) {
		int[] a = { 12, 45, 56, 78, 89, 25 };
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println(max + " largest number");
		
		next();
		next1();
	}
	public static void next() {
		int []a= {12, 45, 56, 78, 89, 25};
		Arrays.sort(a);
		System.out.println(a[a.length-2]+" 2nd largest");
		System.out.println(a[a.length-3]+" 3rd largest");
	}
	public static void next1() {
		int []a= {12,45,56,78,89,25,78,87,88};
		int fmax=a[0];
		int smax=0;
		for(int i=0; i<a.length;i++) {
			if(a[i]>fmax) {
				smax=fmax;
				fmax=a[i];
			}else if(smax<a[i]) {
				smax=a[i];
			}
		}
		System.out.println(fmax+" "+smax);
		
	}
}
