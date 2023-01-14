package org.example.java;

public class one_to_20_divisible_by_2_3_and_both {
	public static void main(String[] args) {
		for(int i=1;i<=20;i++) {
			if(i%2==0) {
				System.out.println(i +" java");
			}
			if(i%3==0) {
				System.out.println(i +" selenium");
			}
			if(i%2==0 && i%3==0) {
				System.out.println(i +" webdriver");
			}
			
		}

	}

}
