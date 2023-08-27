package org.javapractice.java_basic_program;

public class RunSoftSuave1 {
	public static void main(String[] args) {
		String s = "eva can you see bees in cave";
		String[] s1 = s.split(" ");
		String merge = "";
		for (int i = 0; i < s1.length; i++) {
			String string = s1[i];
			String rev = "";
			for (int j = string.length() - 1; j >= 0; j--) {
				rev = rev + string.charAt(j);
			}
			merge = merge + rev;
			System.out.print(rev + " ");
		}
		System.out.println();
		System.out.println(merge);
	}

}
