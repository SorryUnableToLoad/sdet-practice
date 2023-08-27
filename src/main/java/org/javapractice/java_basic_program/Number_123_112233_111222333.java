package org.javapractice.java_basic_program;

public class Number_123_112233_111222333 {
	public static void main(String[] args) {
		int num = 123;
		int temp = 0;

		while (num > 0) {
			int ld = num % 10;
			temp = temp * 10 + ld;
			num = num / 10;
		}
		
		int count = 0;
		for (int j = 0; j < 3; j++) {
			int newnum = temp;
			while (newnum > 0) {

				int ld = newnum % 10;
				for (int i = 0; i <= count; i++) {
					System.out.print(ld);
				}
				newnum = newnum / 10;
				System.out.print("");

			}
			count++;
			System.out.println();

		}

	}
}
