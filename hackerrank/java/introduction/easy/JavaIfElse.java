package introduction.easy;

import java.util.Scanner;

/**
 * Platform: HackerRank
 * Challenge: Java If-Else
 * Problem: https://www.hackerrank.com/challenges/java-if-else/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class JavaIfElse {
    private static final int WEIRD_MIN = 6;
    private static final int WEIRD_MAX = 20;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();

            if (isOdd(n) || isWeirdRange(n)) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        }
    }

    private static boolean isOdd(int n) { return n % 2 != 0; }

    private static boolean isWeirdRange(int n) { return n >= WEIRD_MIN && n <= WEIRD_MAX; }
}
