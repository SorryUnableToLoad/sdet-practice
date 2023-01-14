package org.example.java;

public class Z_28_Decimal_To_Octal {
	public static void main(String[] args) {
		int decimalNum=78;
		int octalNum=0;
		int i=1;
		while (decimalNum!=0) {
			int remainder=decimalNum%8;
			decimalNum=decimalNum/8;
			octalNum=octalNum+remainder*i;
			i=i*10;
		}
		System.out.println(octalNum);
	}
}
