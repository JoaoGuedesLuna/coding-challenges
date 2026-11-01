package datastructures.easy;

import java.util.Scanner;

/**
 * Platform: HackerRank
 * Challenge: Java 2D Array
 * Problem: https://www.hackerrank.com/challenges/java-2d-array/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class Java2DArray {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int[][] prefixes = new int[6][7];

            for (int i = 0; i < prefixes.length; i++) {
                for (int j = 1; j < prefixes[i].length; j++) {
                    prefixes[i][j] = prefixes[i][j - 1] + scanner.nextInt();
                }
            }

            long largestSum = Long.MIN_VALUE;

            for (int i = 0; i < prefixes.length - 2; i++) {
                for (int j = 1; j < prefixes[i].length - 2; j++) {

                    long sum = (prefixes[i][j + 2] - prefixes[i][j - 1]) +
                            (prefixes[i + 1][j + 1] - prefixes[i + 1][j]) +
                            (prefixes[i + 2][j + 2] - prefixes[i + 2][j - 1]);

                    largestSum = Math.max(largestSum, sum);
                }
            }

            System.out.println(largestSum);

        }
    }
}
