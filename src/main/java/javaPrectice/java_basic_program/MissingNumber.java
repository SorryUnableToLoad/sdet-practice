package javaPrectice.java_basic_program;

public class MissingNumber {
	public static void main(String[] args) {
		// given input
		int[] input = { 1, 1, 2, 3, 5, 5, 7, 9, 9, 9 };
		System.out.println(input.length);
		
		
		int[] register = new int[input.length];
		
		for (int i : input) {
			System.out.println(i);
			register[i] = 1;
		}
		
		System.out.println("missing numbers in given array");
		for (int i = 0; i < register.length-1; i++) {
			if (register[i] == 0) {
				System.out.println(i);
			}
		}
	}

}
