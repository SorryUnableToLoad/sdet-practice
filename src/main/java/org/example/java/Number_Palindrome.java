package org.example.java;

public class Number_Palindrome {
	public static void main(String[] args) {
		int num = 121;
		int temp = num;
		int rev = 0;
		while (num > 0) {
			int ld = num % 10;
			rev = rev * 10 + ld;
			num = num / 10;
		}
		if (temp == rev) {
			System.out.println(rev + " Number id palindrome");
		} else {
			System.out.println(rev + " Number is not a palindrome");
		}
		next();
	}
	public static void next(){
		int[] a= {22,55,88,45,89,45,23};
		for(int i=0;i<a.length;i++) {
			int num = a[i];
			int rev=0;
			while(num>0) {
				int ld=num%10;
				rev=rev*10+ld;
				num=num/10;
			}
			if(a[i]==rev) {
				System.out.println(a[i]+" Number is palindrome");
			}
		}
		
		
	}
}
