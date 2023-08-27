package org.javapractice.string;

import java.util.Optional;

public class RemoveLastCharacter {
    public static void main(String[] args) {
        System.out.println(removeLastChar("remove last"));
        System.out.println(removeLastCharOptional("remove last"));
    }

    public static String removeLastChar(String s) {
        return (s == null || s.length() == 0)
                ? null
                : (s.substring(0, s.length() - 1));
    }

    public static String removeLastCharOptional(String s) {
        return Optional.ofNullable(s)
                .filter(str -> str.length() != 0)
                .map(str -> str.substring(0, str.length() - 1))
                .orElse(s);
    }
}
