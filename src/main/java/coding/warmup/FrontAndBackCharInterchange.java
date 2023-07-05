package coding.warmup;

public class FrontAndBackCharInterchange {
    public static void main(String[] args) {
        String interChangedString = interChangeChar("moon");
        System.out.println(interChangedString);
    }
    static String interChangeChar(String str){
        if(str.length()<=1)
        return str;

        String mid = str.substring(1, str.length()-1);
        // last + mid + first
        return str.charAt(str.length()-1) + mid + str.charAt(0);
    }


}
