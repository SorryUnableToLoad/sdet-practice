package org.javapractice.java_basic_program;

public class Reverce_String {
	public static void main(String[] args) {
		String s="selenium";
		String rev="";
		for (int i = 0; i < s.length(); i++) {
			rev=s.charAt(i)+rev;
		}
		System.out.println(rev);
	}
}
