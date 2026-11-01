package datastructures.easy;

import java.util.Scanner;

/**
 * Platform: HackerRank
 * Challenge: Java 1D Array
 * Problem: https://www.hackerrank.com/challenges/java-1d-array-introduction/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class Java1DArray {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < a.length; i++) {
                a[i] = scanner.nextInt();
            }

            for (int element: a) {
                System.out.println(element);
            }

        }
    }
}
