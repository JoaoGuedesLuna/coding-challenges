package strings.easy;

import java.util.Scanner;

/**
 * Platform: HackerRank
 * Challenge: Java String Reverse
 * Problem: https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class JavaStringReverse {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            final String A = scanner.next();

            System.out.println(isPalindrome(A) ? "Yes" : "No");

        }
    }

    public static boolean isPalindrome(final String A) {
        int left = 0;
        int right = A.length() - 1;

        while (left < right) {
            if (A.charAt(left) != A.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
