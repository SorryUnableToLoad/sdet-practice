package coding.warmup;

//Given 2 ints, a and b,
//return true if one of them is 10 or if their sum is 10.
public class Makes10 {
    public static void main(String[] args) {
        boolean eq10 = makes10(15, 10);
        System.out.println(eq10);
    }

    private static boolean makes10(int a, int b) {
        if (a == 10 || b == 10 ||a+b == 10) {
            return true;
        }
        return false;
    }
}
