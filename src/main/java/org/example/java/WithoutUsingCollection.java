package org.example.java;

public class WithoutUsingCollection {
	public static void main(String[] args) {

		String[] a = { "python", "java", "python", "java", "java", "c#" };
		for (int i = 0; i < a.length; i++) {
			int count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i].equals(a[j])) {
					count++;
					a[j] = "0";
				}
			}
			if (count > 1 && a[i] != "0") {
				System.out.println(a[i]);
			}
		}
		System.out.println("---------------------------------");
		next();
	}
	static void next() {
		String s = "malayalam";
		// char[] s1 = s.toCharArray();
		int[] s1 = { 12, 12, 13, 13, 14, 1, 415, 15, 15, 15 };
		for (int i = 0; i < s1.length; i++) {
			int count = 1;
			for (int j = i + 1; j < s1.length; j++) {
				if (s1[i] == s1[j]) {
					count++;
					s1[j] = '0';
				}
			}
			if (count >= 1 && s1[i] != '0') {
				System.out.println(s1[i] + " " + count);
			}

		}

	}

}
