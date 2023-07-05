package coding.warmup;
//Given an int n, return true if it is within 10 of 100 or 200.
//Note: Math.abs(num) computes the absolute value of a number.
public class NearHundred {
    public static void main(String[] args) {
        boolean near100 = nearHundred(189);
        System.out.println(near100);
    }

    private static boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10));
    }
}
