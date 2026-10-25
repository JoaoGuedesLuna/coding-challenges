package introduction.easy;

import java.util.Scanner;

/**
 * Platform: HackerRank
 * Challenge: Java Loops I
 * Problem: https://www.hackerrank.com/challenges/java-loops-i/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class JavaLoopsI {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d x %d = %d%n", n, i, (n * i));
            }
        }
    }
}
