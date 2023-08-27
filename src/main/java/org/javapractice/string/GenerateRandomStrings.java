package org.javapractice.string;

import java.nio.charset.StandardCharsets;
import java.util.Random;

public class GenerateRandomStrings {
    Random random = new Random();

    public static void main(String[] args) {
        System.out.println("start");
        GenerateRandomStrings generateRandomStrings = new GenerateRandomStrings();
        System.out.println(generateRandomStrings.givenUsingPlainJavaWhenGeneratingRandomStringUnboundedThenCorrect());
        System.out.println(generateRandomStrings.givenUsingPlainJavaWhenGeneratingRandomStringBoundedThenCorrect());
        System.out.println(generateRandomStrings.givenUsingJava8WhenGeneratingRandomAlphabeticStringThenCorrect());
        System.out.println(generateRandomStrings.givenUsingJava8WhenGeneratingRandomAlphanumericStringThenCorrect());
    }

    public String givenUsingPlainJavaWhenGeneratingRandomStringUnboundedThenCorrect() {
        byte[] array = new byte[17]; // length is bounded by 7
        random.nextBytes(array);
        return new String(array,
                StandardCharsets.UTF_8);

    }

    public String givenUsingPlainJavaWhenGeneratingRandomStringBoundedThenCorrect() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            //int randomLimitedInt = leftLimit + (random.nextInt() * (rightLimit - leftLimit + 1));
            int randomLimitedInt = leftLimit + random.nextInt(rightLimit - leftLimit + 1);
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();
    }

    public String givenUsingJava8WhenGeneratingRandomAlphabeticStringThenCorrect() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;

        return random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    public String givenUsingJava8WhenGeneratingRandomAlphanumericStringThenCorrect() {
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        return random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}
