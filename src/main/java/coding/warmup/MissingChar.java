package coding.warmup;

//Given a non-empty string and an int n,
//return a new string where the char at index n has been removed.
//The value of n will be a valid index of a char in the original string
//(i.e. n will be in the range 0..str.length()-1 inclusive).


public class MissingChar {
    public static void main(String[] args) {
        String missingChar = missingChar("Good", 3);
        System.out.println(missingChar);
    }
    public static String missingChar(String str, int n) {
        String front = str.substring(0, n);

        // Start this substring at n+1 to omit the char.
        // Can also be shortened to just str.substring(n+1)
        // which goes through the end of the string.
        String back = str.substring(n+1, str.length());

        return front + back;
    }
}
