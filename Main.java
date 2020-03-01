package com.acejones;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] testArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Original Array: " + Arrays.toString(testArray));
        reverse(testArray);
        System.out.println("Reversed Array: " + Arrays.toString(testArray));
    }

    public static void reverse(int[] array) {
        int[] tempArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < (array.length / 2); i++) {
            array[0 + i] = tempArray[array.length - 1 - i];
            array[array.length - 1 - i] = tempArray[0 + i];
        }
    }
}
