package org.javapractice.java_basic_program;

public class Z_25_BinaryNumber_To_DecimalNumber {
	public static void main(String[] args) {
		int binaryNumber = 10011100;
		double decimalNumber = 0;
		int i = 0;
		while (binaryNumber != 0) {
			int remainder = binaryNumber % 10;
			binaryNumber = binaryNumber / 10;
			decimalNumber = decimalNumber + (remainder * Math.pow(2, i));
			i++;
		}
		System.out.println(decimalNumber);
	}

}
