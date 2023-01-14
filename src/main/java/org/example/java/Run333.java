package org.example.java;

public class Run333 {
public static void main(String[] args) {
	String s="aaabccdeeffgggaaabbbvvch";  
	//a3 b1 c2 d1 e2 f2 g3 a3 b3 v2 c1 h1	
	for (int i = 0; i < s.length(); i++) {
		int count=1;
		for(int j=i+1;j<s.length();j++) {
			if(s.charAt(i)==s.charAt(j)) {
				count++;
				i++;
			}else {
				break;
			}
		}
		System.out.print(s.charAt(i)+""+(count)+" ");
	}
}
}
