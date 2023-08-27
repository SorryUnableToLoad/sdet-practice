package org.javapractice.array;

public class MinAndMaxElement {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 77, 18, 29, 49};
        minAndMaxElement(array);
    }

   static void minAndMaxElement(int[] array){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int num : array) {
            if (num > max) {
                max = num;
            } else if (num < min) {
                min = num;
            }

        }

        System.out.println("max element : " + max);
        System.out.println("min element : " + min);
    }

}
