package javaPrectice.array;

import java.util.Arrays;

public class InsertAnElementOnPosition {
    public static void main(String[] args) {
        int[] array = new int[]{25, 14, 56, 77,18,29,49};
        int index_position = 1;
        int new_value = 6;
        System.out.println("Original array :" + Arrays.toString(array));
        for (int i = array.length - 1; i > index_position; i--) {
            array[i] = array[i - 1];
        }
        array[index_position] = new_value;
        System.out.println("New array :" + Arrays.toString(array));
    }
}
