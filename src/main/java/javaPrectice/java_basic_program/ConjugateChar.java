package javaPrectice.java_basic_program;

import java.util.LinkedHashSet;

public class ConjugateChar {
	public static void main(String[] args) {

		String str = "abababbabaacdccdd";
		String s = "";
		LinkedHashSet<String> ls = new LinkedHashSet<String>();
		for (int i = 0; i < str.length(); i++) {

			if (i + 1 == (str.length() - 1)) {
				if (str.charAt(i) == str.charAt(i + 1)) {
					s = str.charAt(i) + "" + str.charAt(i + 1);
					ls.add(s);
					break;
				}
			} else {
				if (str.charAt(i) == str.charAt(i + 1)) {
					s = str.charAt(i) + "" + str.charAt(i + 1);
					ls.add(s);
				}
			}

		}

		for (String st : ls) {
			System.out.println(st);
		}

	}
}
