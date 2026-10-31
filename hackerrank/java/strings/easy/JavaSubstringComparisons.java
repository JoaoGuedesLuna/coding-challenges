package strings.easy;

import java.util.Scanner;

/**
 * Platform: HackerRank
 * Challenge: Java Substring Comparisons
 * Problem: https://www.hackerrank.com/challenges/java-string-compare/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class JavaSubstringComparisons {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            String s = scanner.next();
            int k = scanner.nextInt();

            System.out.println(getSmallestAndLargest(s, k));

        }
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = smallest;

        for (int i = 1; i <= s.length() - k; i++) {

            String subString = s.substring(i, k + i);

            if (smallest.compareTo(subString) > 0) {
                smallest = subString;
            } else if (largest.compareTo(subString) < 0) {
                largest = subString;
            }

        }

        return String.format("%s%n%s", smallest, largest);
    }
}
