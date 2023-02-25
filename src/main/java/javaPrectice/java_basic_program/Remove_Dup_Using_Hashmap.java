package javaPrectice.java_basic_program;

import java.util.HashMap;
import java.util.Map.Entry;

public class Remove_Dup_Using_Hashmap {
	public static void main(String[] args) {
		String s = "wwwpreettiw";
		char[] s1 = s.toCharArray();
		Integer ss = 0;
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (char ch : s1) {
			if (hm.containsKey(ch)) {
				ss = hm.get(ch) + 1;
				hm.put(ch, ss);
				// if (ss == 3 && ch=='a') {
				// System.out.print(ch + "" + ss);
				// }
			} else {
				hm.put(ch, 1);
			}
		}

		for (Entry<Character, Integer> mm : hm.entrySet()) {
			System.out.println(mm);
		}

	}

}
