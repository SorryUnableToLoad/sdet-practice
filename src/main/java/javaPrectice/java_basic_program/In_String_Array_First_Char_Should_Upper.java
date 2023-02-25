package javaPrectice.java_basic_program;

public class In_String_Array_First_Char_Should_Upper {

	public static void main(String[] args) {
		// create a string
		String str = "this is java code";
		String words[] = str.split(" ");
		//String capitalizeStr = "";

		for (String word : words) {
			
			// Capitalize first letter
			String firstLetter = word.substring(0, 1).toUpperCase();
			// Get remaining letter
			String remainingLetters = word.substring(1);
			System.out.print(firstLetter + remainingLetters + " ");
			
			//capitalizeStr += firstLetter + remainingLetters + " ";
		}
		
		//System.out.println(capitalizeStr);
	}
}
