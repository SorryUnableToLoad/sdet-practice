package org.javapractice.java_basic_program;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class CojugateCharAndConjugateSame {
	// input : abcabccaabb
	// output : ccaabb
	public static void main(String[] args) {

		String s = "abcabccaabb";
		String s1 = "";
		HashSet<String> hs = new HashSet<String>();
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				s1 = s.charAt(i) + "" + s.charAt(i + 1);
				hs.add(s1);
			}
		}
		for (String ss : hs) {
			System.out.print(ss + " ");
		}

		System.out.println();
		//next();
		System.out.println();
		next1();
	}

	public static void next() {
		String s = "aabbab";
		LinkedHashSet<String> set = new LinkedHashSet<String>();

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				String s1 = "" + s.charAt(i) + s.charAt(j);
				set.add(s1);
			}
		}
		for (String string : set) {
			System.out.print(string + " ");
		}
	}

	public static void next1() {
		String s = "aabbab";
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		String s1 = "";
		/*
		 * for (int i = 0; i < s.length() - 1; i++) { s1 = "" + s.subSequence(i, i + 2);
		 * set.add(s1); }
		 */

		for (int i = 0; i < s.length() - 1; i++) {
			s1 = s.substring(i, i + 2);
			set.add(s1);
		}
		for (String string : set) {
			System.out.println(string + " ");
		}

	}

}
