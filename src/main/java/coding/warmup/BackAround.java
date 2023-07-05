package coding.warmup;

public class BackAround {
    public static void main(String[] args) {
        String around = backAround("baba");
        System.out.println(around);
    }
    static String backAround(String str){
        String lastChar = str.substring(str.length() - 1);
        return lastChar+str+lastChar;
    }

}
