package org.javapractice.java_basic_program;

public class Occurance_of_words_inString {
	public static void main(String[] args) {
		String str="my name is Suraj ";
		String[] strr = str.split(" ");
		
		for(int i=0;i<strr.length;i++) {
			int count=0;
			for(int j=0;j<strr.length;j++) {
				if(strr[i]==strr[j]) {
					count ++;
				}
			}
			System.out.println(strr[i]+" "+count+"times");
		}
	}

}
