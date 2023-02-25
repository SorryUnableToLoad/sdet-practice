package javaPrectice.java_basic_program;

public class Z_26_DecimalNumber_To_Binary {
	public static void main(String[] args) {
		int decimalNumber = 156;
		long binaryNumber = 0;
		int i = 1;
		while (decimalNumber != 0) {
			int remainder = decimalNumber % 2;
			decimalNumber = decimalNumber / 2;
			binaryNumber = binaryNumber + remainder * i;
			i = i * 10;
		}
		System.out.println(binaryNumber);
	}
}
