package by.java.firstLesson;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number size of massive: ");
        int sizeOfMassive = input.nextInt();

        int massive[] = new int[sizeOfMassive];
        System.out.println("Input array elements :");
        for (int i = 0; i < sizeOfMassive; i++) {
            massive[i] = input.nextInt();
        }
        System.out.print("Massive elements =");
        for (int i = 0; i < sizeOfMassive; i++) {
            System.out.print(" " + massive[i]);
        }
        int length = massive.length;
        boolean isSorted = false;
        int buffer = Integer.MIN_VALUE;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < length-1; i++) {
                if (massive[i] > massive[i+1]) {
                    isSorted = false;
                    buffer = massive[i];
                    massive[i] = massive[i+1];
                    massive[i+1] = buffer;
                }
            }
        }
        System.out.println();
        System.out.println("Arrays with sorted in ascending order " + Arrays.toString(massive));

        boolean isSortedNew = false;
        int bufferTwo = Integer.MIN_VALUE;
        while(!isSortedNew) {
            isSortedNew = true;
            for (int i = 0; i < length-1; i++) {
                if (massive[i] < massive[i+1]) {
                    isSortedNew = false;
                    bufferTwo = massive[i];
                    massive[i] = massive[i+1];
                    massive[i+1] = bufferTwo;
                }
            }
        }
        System.out.println("Arrays with sorted in descending order " + Arrays.toString(massive));

        for (int i = 0; i < massive.length; i++) {
            int key = massive[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (key < massive[j]) {
                    massive[j + 1] = massive[j];
                } else {
                    break;
                }
            }
            massive[j + 1] = key;
        }
        System.out.println("Arrays with sorted with insertion sort " + Arrays.toString(massive));
    }
}
