package org.javapractice.java_basic_program;

import java.util.LinkedHashSet;

public class Run {
	public static void main(String[] args) {

		String s = "wwwpreettiw ";
		// o/p-w3p1r1e2t2i1w1

		for (int i = 0; i < s.length(); i++) {
			int count = 1;
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;
				} else {
					System.out.print(s.charAt(i) + "" + count);
					break;
				}
				i = j;
			}
		}
		System.out.println();
		System.out.println("--------------");
		
		String s1 = "wwwpreettiw";
		LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
		for (int i = 0; i < s1.length(); i++) {
			hs.add(s.charAt(i));
		}
		for (Character character : hs) {
			int count = 0;
			for (int i = 0; i < s1.length(); i++) {
				if (character == s1.charAt(i)) {
					count++;
				}
			}
			System.out.print(character + "" + count);
		}
		System.out.println();
		System.out.println("--------------");
		
		String s2 = "wwwpreettiw";

		for (int i = 0; i < s2.length(); i++) {
			int count = 1;
			for (int j = i + 1; j < s2.length(); j++) {
				if (s2.charAt(i) == s2.charAt(j)) {
					count++;
					i++;
				} else {
					break;
				}
			}
			System.out.print(s2.charAt(i) + "" + count);

		}

	}
}
