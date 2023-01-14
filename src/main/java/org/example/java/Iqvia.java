package org.example.java;

import java.util.ArrayList;

public class Iqvia {

	public static void main(String[] args) {
		Object a[] = {10,20,30};
		/*
		 * int fmin = a[0]; int smin = 0;
		 * 
		 * for (int i = 1; i < a.length; i++) { if (a[i] < fmin) { smin = fmin;
		 * 
		 * fmin = a[i]; } else if (smin > a[i]) { smin = a[i]; } }
		 * System.out.println("2nd Minimum number is " + smin);
		 */
		
		ArrayList ts = new ArrayList();
		
		for (int i = 0; i < a.length; i++) {
			ts.add(a[i]);
		}
		System.out.println(ts);
		for (Object object : ts) {
			System.out.println(object);
		}
		for (int i = 0; i < ts.size(); i++) {
			System.out.println(ts.get(1));
		}
		
	}

}
