package org.javapractice.string;

public class OccurrenceOfCharInAString {
    public static void main(String[] args) {

        String str = "elephant";
        String str1 = "apple";
        System.out.println(occurrence(str, 'e'));
        System.out.println(occurrence(str1, 'p'));

        System.out.println(useRecursion(str, 'e', 1));

        System.out.println(byUsingJava8(str,'e'));
        System.out.println(byUsingJava8(str1,'p'));

    }

    private static int occurrence(String someString, char searchedChar) {
        int count = 0;
        for (int i = 0; i < someString.length(); i++) {
            if (someString.charAt(i) == searchedChar) {
                count++;
            }
        }
        return count;
    }

    private static int useRecursion(String someString, char searchedChar, int index) {
        if (index >= someString.length()) {
            return 0;
        }

        int count = someString.charAt(index) == searchedChar ? 1 : 0;
        return count + useRecursion(someString, searchedChar, index + 1);
    }
    private static long byUsingJava8(String someString, char searchedChar){
        return someString.chars().filter(ch -> ch == searchedChar).count();
        //return someString.codePoints().filter(ch -> ch == searchedChar).count();
    }
}
