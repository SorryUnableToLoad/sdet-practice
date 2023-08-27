package org.javapractice.java_basic_program;

public class Array_in_Assending {

	public static void main(String[] args) {
		// int[] a = { 1, 2, 3 };
		// int[] a = { 3, 2, 1 };
		int[] a = { 2, 3, 1 };
		// int[] a = { 3, 1, 2 };
		boolean flag;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] < a[i + 1]) {
				flag = true;
				i++;
			} else {
				flag = false;
			}
		}
		if (flag = true) {
			System.out.println("The array is in assending order");
		}
		if (flag = false) {
			System.out.println("The array is in random order");
		}
	}
}
