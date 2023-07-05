package coding.warmup;

//Given an int n, return the absolute difference between n and 21,
//except return double the absolute difference if n is over 21.
public class Diff21 {
    public static void main(String[] args) {
        int diff = diff21(23);
        System.out.println(diff);
    }

    private static int diff21(int i) {
        if (i <= 21) {
            return (21 - i);
        } else {
            return (i - 21) * 2;
        }
    }
}
