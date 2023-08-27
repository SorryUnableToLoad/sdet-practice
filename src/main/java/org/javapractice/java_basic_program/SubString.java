package org.javapractice.java_basic_program;

import java.util.LinkedHashSet;

public class SubString {
	public static void main(String[] args) {
		String s = "aabba";

		LinkedHashSet<String> set = new LinkedHashSet<String>();

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				String s1 = s.substring(i, j);
				// System.out.println(s1);
				if (s1.length() == 1) {
					set.add(s1);
				}
				if (s1.length() > 1) {
					set.add(s1);
				}
			}
		}
		System.out.println(set);

		String min = "";
		for (String string : set) {
			min = string;
			if (min.length() > string.length()) {
				min = string;
			}
		}

		for (String string : set) {
			if (min.length() == string.length())
				System.out.println(string);
		}

	}

}
