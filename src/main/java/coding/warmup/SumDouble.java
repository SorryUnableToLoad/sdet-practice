package coding.warmup;
//Given two int values, return their sum.
//Unless the two values are the same, then return double their sum.
public class SumDouble {
    public static void main(String[] args) {
        int sumDouble = sumDouble(1, 2);
        System.out.println(sumDouble);
        int sumDouble1 = sumDouble(2, 2);
        System.out.println(sumDouble1);


    }
    public static int sumDouble(int x, int y) {
        int sum = x+y;
        if(x==y){
            sum = sum*2;
        }
        return sum;
    }
}
