package javaPrectice.java_basic_program;

public class String_Is_Palindrome {
	public static void main(String[] args) {
		String s = "abcba";
		String s1 = "";
		for (int i =0; i<s.length(); i++) {
			s1 = s1 + s.charAt(i);
		}
		if (s.equals(s1)) {
			System.out.println(s1 + " String is palindrome");
		} else {
			System.out.println(s1 + " String is not a spalindrome");
		}
		next();
	}

	public static void next() {
		String s="java program java ";
		String[] s1 = s.split(" ");
		String s2="";
		for(int i=s1.length-1;i>=0;i--){
			s2=s2+(s1[i]+" ");
		}
		if(s.equals(s2)) {
			System.out.println(s2+" Given String is palindrome");
		}else {
			System.out.println(s2+" String is not a palindrome");
		}
	}
}
