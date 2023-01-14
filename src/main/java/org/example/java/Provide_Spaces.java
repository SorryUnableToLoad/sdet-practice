package org.example.java;

public class Provide_Spaces {
	public static void main(String[] args) {
		String s = "IAmEngineer";
		String ss = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				ss = " " + s.charAt(i);
				System.out.print(ss);
			} else {
				System.out.print(s.charAt(i));
			}
		}
	}

}
