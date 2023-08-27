package org.javapractice.string;

import java.util.stream.IntStream;

public class PalindromeString {
    public static void main(String[] args) {

        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindromeReverseTheString("madam"));
        System.out.println(isPalindromeUsingStringBuilder("madam"));
        System.out.println(isPalindromeUsingStringBuffer("madam"));
        System.out.println(isPalindromeUsingIntStream("madam"));
        System.out.println(isPalindromeRecursive("madam"));
    }

    public static boolean isPalindrome(String text) {
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        int length = clean.length();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward) {
            char forwardChar = clean.charAt(forward++);
            char backwardChar = clean.charAt(backward--);
            if (forwardChar != backwardChar)
                return false;
        }
        return true;
    }

    public static boolean isPalindromeReverseTheString(String text) {
        StringBuilder reverse = new StringBuilder();
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        char[] plain = clean.toCharArray();
        for (int i = plain.length - 1; i >= 0; i--) {
            reverse.append(plain[i]);
        }
        return (reverse.toString()).equals(clean);
    }

    public static boolean isPalindromeUsingStringBuilder(String text) {
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        StringBuilder plain = new StringBuilder(clean);
        StringBuilder reverse = plain.reverse();
        return (reverse.toString()).equals(clean);
    }

    public static boolean isPalindromeUsingStringBuffer(String text) {
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        StringBuffer plain = new StringBuffer(clean);
        StringBuffer reverse = plain.reverse();
        return (reverse.toString()).equals(clean);
    }

    public static boolean isPalindromeUsingIntStream(String text) {
        String temp = text.replaceAll("\\s+", "").toLowerCase();
        return IntStream.range(0, temp.length() / 2)
                .noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));
    }

    public static boolean isPalindromeRecursive(String text) {
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        return recursivePalindrome(clean, 0, clean.length() - 1);
    }

    private static boolean recursivePalindrome(String text, int forward, int backward) {
        if (forward == backward) {
            return true;
        }
        if ((text.charAt(forward)) != (text.charAt(backward))) {
            return false;
        }
        if (forward < backward + 1) {
            return recursivePalindrome(text, forward + 1, backward - 1);
        }

        return true;
    }
}
