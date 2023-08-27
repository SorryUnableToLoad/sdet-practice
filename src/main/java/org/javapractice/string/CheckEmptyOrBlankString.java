package org.javapractice.string;

public class CheckEmptyOrBlankString {
    public static void main(String[] args) {
        CheckEmptyOrBlankString checkEmptyOrBlankString = new CheckEmptyOrBlankString();
        System.out.println(checkEmptyOrBlankString.isEmptyString(""));
        System.out.println(checkEmptyOrBlankString.isEmptyString("a"));
        System.out.println(checkEmptyOrBlankString.isEmptyString2(""));
        System.out.println(checkEmptyOrBlankString.isEmptyString2("a"));
        System.out.println(checkEmptyOrBlankString.isBlankString(""));
        System.out.println(checkEmptyOrBlankString.isBlankString("a"));
        System.out.println(checkEmptyOrBlankString.isBlankString2(""));
        System.out.println(checkEmptyOrBlankString.isBlankString2("a"));
    }

    boolean isEmptyString(String string) {
        return string == null || string.isEmpty();
    }
    boolean isEmptyString2(String string) {
        return string == null || string.length() == 0;
    }
    boolean isBlankString(String string) {
        return string == null || string.trim().isEmpty();
    }
    boolean isBlankString2(String string) {
        return string == null || string.isBlank();
    }

}
