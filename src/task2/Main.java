package task2;

import java.util.Arrays;

public class Main {

//    Напишите программу, которая переворачивает массив

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] reverse = new int[7];

        for (int i = 0; i < arr.length; i++) {
            reverse[i] = arr[arr.length - i - 1];
        }

        for (int j : reverse) {
            System.out.print(j + " ");
        }
        System.out.println();
        Arrays.stream(reverse).forEach(value -> System.out.print(value + " "));

    }
}
