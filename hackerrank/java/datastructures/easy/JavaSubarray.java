package datastructures.easy;

import java.util.Scanner;

/**
 * Platform: HackerRank
 * Challenge: Java Subarray
 * Problem: https://www.hackerrank.com/challenges/java-negative-subarray/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class JavaSubarray {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int n = scanner.nextInt();

            long[] prefixes = new long[n + 1];

            for (int i = 1; i <= n; i++) {
                prefixes[i] = prefixes[i - 1] + scanner.nextLong();
            }

            System.out.println(countInversions(prefixes));

        }
    }

    public static long countInversions(long[] prefixes) {
        long[] aux = new long[prefixes.length];
        return countInversions(prefixes, aux, 0, prefixes.length -1);
    }

    public static long countInversions(long[] prefixes, long[] aux, int left, int right) {
        if (left >= right) return 0;

        int mid = left + ((right - left) / 2);

        long count = 0;

        count += countInversions(prefixes, aux, left, mid);
        count += countInversions(prefixes, aux, mid + 1, right);

        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {
            if (prefixes[i] <= prefixes[j]) {
                aux[k++] = prefixes[i++];
            } else {
                aux[k++] = prefixes[j++];
                count += mid - i + 1;
            }
        }

        while (i <= mid) {
            aux[k++] = prefixes[i++];
        }

        while (j <= right) {
            aux[k++] = prefixes[j++];
        }

        for (int p = left; p <= right; p++) {
            prefixes[p] = aux[p];
        }

        return count;
    }
}
