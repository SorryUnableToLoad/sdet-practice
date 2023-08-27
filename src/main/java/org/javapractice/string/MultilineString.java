package org.javapractice.string;

import java.io.PrintWriter;
import java.io.StringWriter;

public class MultilineString {
    String newLine = System.getProperty("line.separator");
    public static void main(String[] args) {
        MultilineString multilineString = new MultilineString();
        System.out.println(multilineString.textBlocks());
        System.out.println(multilineString.stringConcatenation());
        System.out.println(multilineString.stringConcatenations());
        System.out.println(multilineString.stringJoin());
        System.out.println(multilineString.stringBuilder());
        System.out.println(multilineString.stringWriter());


    }
    public String textBlocks() {
        return """
        Get busy living
        or
        get busy dying.
        --Stephen King""";
    }
    public String stringConcatenation() {
        return "Get busy living"
                .concat(newLine)
                .concat("or")
                .concat(newLine)
                .concat("get busy dying.")
                .concat(newLine)
                .concat("--Stephen King");
    }
    public String stringConcatenations() {
        return "Get busy living"
                + newLine
                + "or"
                + newLine
                + "get busy dying."
                + newLine
                + "--Stephen King";
    }
    public String stringJoin() {
        return String.join(newLine,
                "Get busy living",
                "or",
                "get busy dying.",
                "--Stephen King");
    }
    public String stringBuilder() {
        return new StringBuilder()
                .append("Get busy living")
                .append(newLine)
                .append("or")
                .append(newLine)
                .append("get busy dying.")
                .append(newLine)
                .append("--Stephen King")
                .toString();
    }
    public String stringWriter() {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.println("Get busy living");
        printWriter.println("or");
        printWriter.println("get busy dying.");
        printWriter.println("--Stephen King");
        return stringWriter.toString();
    }
}
