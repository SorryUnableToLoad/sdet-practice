package org.example.java;

public class Fibonancci_Series {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		for(int i=0;i<10;i++) {
			int c=a+b;
			System.out.print(c+",");
			a=b;
			b=c;
		}
	}
}
