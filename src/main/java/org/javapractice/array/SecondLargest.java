package org.javapractice.array;

public class SecondLargest {
    public static void main(String[] args) {
        int[] array = {3, 5, 6, 7, 2, 5, 7, 8, 9};
        int largest = array[0];
        int secondLargest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest) {
                secondLargest = array[i];
            }
        }
        System.out.println(largest);
        System.out.println(secondLargest);
    }
}
