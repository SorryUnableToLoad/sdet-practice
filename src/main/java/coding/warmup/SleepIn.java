package coding.warmup;

public class SleepIn {
    //The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
    //We sleep in if it is not a weekday, or we're on vacation.
    //Return true if we sleep in.

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if(!weekday||vacation){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        boolean sleep = sleepIn(true,true);
        System.out.println(sleep);
        boolean sleep1 = sleepIn(true,false);
        System.out.println(sleep1);
        boolean sleep2= sleepIn(false,true);
        System.out.println(sleep2);
        boolean sleep3 = sleepIn(false,false);
        System.out.println(sleep3);
    }
}
