package coding.warmup;
//We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
//We are in trouble if they are both smiling or if neither of them is smiling.
//Return true if we are in trouble.
public class MonkeyTrouble {

    public static boolean monkeyTrouble(boolean aSmile,boolean bSmile){
        if(aSmile && bSmile){
            return true;
        }
        if(!aSmile && !bSmile){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean trouble = monkeyTrouble(true, true);
        System.out.println(trouble);
        boolean trouble1 = monkeyTrouble(true, false);
        System.out.println(trouble1);
        boolean trouble2 = monkeyTrouble(false, true);
        System.out.println(trouble2);
        boolean trouble3 = monkeyTrouble(false, false);
        System.out.println(trouble3);

    }
}
