package org.javapractice.java_basic_program;

import java.util.HashSet;

public class Run111 {
	public static void main(String[] args) {
		String s = "carbikecar ";
		String s1 = "";
		for (int i = 0; i < s.length() - 1; i++) {
			if (i == 3 || i == 7) {
				s1 = s1 + " " + s.charAt(i);

			} else {
				s1 = s1 + s.charAt(i);
				continue;
			}

		}
		System.out.println(s1);
		System.out.println("----------------------");

		String[] word = s1.split(" ");
		HashSet<String> hs = new HashSet<String>();
		for (int i = 0; i < word.length; i++) {
			hs.add(word[i]);
		}
		for (String string : hs) {
			int count = 0;
			for (int i = 0; i < word.length; i++) {
				if (string.equals(word[i])) {
					count++;
				}
			}
			System.out.println(string + " " + count);
		}

	}

}
