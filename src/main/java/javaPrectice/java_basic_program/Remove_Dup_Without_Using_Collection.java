package javaPrectice.java_basic_program;

public class Remove_Dup_Without_Using_Collection {
	public static void main(String[] args) {
		String s = "aabbaabbbac";

		for (int i = 0; i < s.length(); i++) {
			int count = 1;
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;
					i++;

				} else {
					break;
				}
			}
			System.out.print(s.charAt(i) + "" + count);

		}
	}
}
