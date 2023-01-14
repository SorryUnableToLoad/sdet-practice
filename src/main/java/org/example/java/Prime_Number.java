package org.example.java;

public class Prime_Number {
	public static void main(String[] args) {
		int num = 6;
		int i = 2;
		while (i <= num) {
			if (num % i == 0) {
				break;
			} else {
				i++;
			}
		}
		if (num == i) {
			System.out.println(num + " number is prime");
		} else {
			System.out.println(num + " number is not a prime");
		}
		next();
		next1();
		next2();
	}

	public static void next() {
		int[] a = { 12, 45, 78, 7, 56, 1, 2, 3, 13, 17, };
		for (int i = 0; i < a.length; i++) {
			int num = a[i];
			int m = 2;
			while (m <= num) {
				if (num % m == 0) {
					break;
				} else {
					m++;
				}
			}
			if (num == m) {
				System.out.println(num + " number is prime");
			}
		}
	}

	public static void next1() {
		
		for (int i = 0; i <= 100; i++) {
			int num = i;
			int m = 2;
			while (m <= num) {
				if (num % m == 0) {
					break;
				} else {
					m++;
				}
			}
			if (num == m) {
				System.out.print(num+" ");
			}
		}
	}

	public static void next2() {

		int count = 0, t = 0, i = 1, num = 1;
		while (count < 100) {
			t = 0;
			i = 1;
			while (i <= num) {
				if (num % i == 0)
					t++;
				i++;
			}
			if (t == 2) {
				System.out.print(num + " ");
				count++;
			}
			num++;
		}
	}

}
