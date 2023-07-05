package coding.warmup;

//Given a string,
//return a new string where the first and last chars have been exchanged.

public class NotString {
    public static void main(String[] args) {
        String string = notString(" Suraj");
        System.out.println(string);
    }

    public static String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        }
        return "not" + str;
    }

}
