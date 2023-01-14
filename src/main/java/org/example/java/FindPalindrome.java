package org.example.java;

public class FindPalindrome {

	public static void main(String[] args) {

		int a[] = { 22, 36, 49, 78, 12, 19, 96 };
		for (int i = 0; i < a.length; i++) {
			int n = a[i];
			int rev = 0;
			while (n > 0) {
				int ld = n % 10;
				rev = rev*10 + ld;
				n = n / 10;
			}
			if (a[i] == rev) {
				System.out.println(a[i] + " is palindrome");
			}
		}

	}
}
