package org.javapractice.java_basic_program;

public class Print {

	public int abc() {
		return 5;
	}

	public static void main(String[] args) {
		Print pr = new Print();
		int value = pr.abc();
		System.out.println(pr.abc());
	}
}
