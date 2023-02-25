package javaPrectice.java_basic_program;

import java.util.HashMap;
import java.util.Map.Entry;

public class FindOccuranceOfEachCharUsingHashMap {

	public static void main(String[] args) {

		String str = "RishavSingh";
		characterCount(str);
	}

	public static void characterCount(String inputString) {

		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		char[] strArray = inputString.toCharArray();
		
		for (char c : strArray) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}
		for (Entry<Character, Integer> entry : charCountMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
