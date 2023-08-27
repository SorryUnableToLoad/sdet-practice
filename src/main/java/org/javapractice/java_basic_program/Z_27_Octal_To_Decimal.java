package org.javapractice.java_basic_program;

public class Z_27_Octal_To_Decimal {
	public static void main(String[] args) {
		int octalNum=116;
		double decimalnum=0;
		int i=0;
		while(octalNum!=0) {
			int remainder=octalNum%10;
			octalNum=octalNum/10;
			decimalnum=decimalnum+(remainder*Math.pow(8, i));
			i++;
		}
		System.out.println(decimalnum);
	}
}
