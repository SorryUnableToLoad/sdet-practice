package org.example.java;

import java.util.Scanner;

public class RunSoftSuave2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter versions");
		String version1 = input.next();
		String version2 = input.next();
		if (version1.equals(version2)) {
			System.out.println("Both are equal");
		}
		//System.out.println(version1.compareTo(version2));
		if(version1.compareTo(version2)==-1) {
			System.out.println(version2);
		}
		//System.out.println(version2.compareTo(version1));
		if(version1.compareTo(version2)==1) {
			System.out.println(version1);
		}
	}

}
