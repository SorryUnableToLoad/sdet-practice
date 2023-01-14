package org.example.java;

import java.util.HashMap;

public class Occurance_Using_HashMap {
	public static void main(String[] args) {
		String s = "Ssurajkumaraa";
		char[] s1 = s.toCharArray();

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (char ch : s1) {
			if (hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch) + 1);
			} else {
				hm.put(ch, 1);
			}

		}
		/*
		 * for (Entry<Character, Integer> keyvalue : hm.entrySet()) {
		 * System.out.println(keyvalue);
		 * 
		 * Character key = keyvalue.getKey(); Integer value = keyvalue.getValue();
		 * System.out.println(key + "" + value); }
		 */
	}
}
