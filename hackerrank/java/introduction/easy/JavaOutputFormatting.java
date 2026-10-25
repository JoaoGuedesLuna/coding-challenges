package introduction.easy;

import java.util.Scanner;

/**
 * Platform: HackerRank
 * Challenge: Java Output Formatting
 * Problem: https://www.hackerrank.com/challenges/java-output-formatting/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class JavaOutputFormatting {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("================================");

            for (int i = 0; i < 3; i++) {
                String s = scanner.next();
                int n = scanner.nextInt();

                System.out.printf("%-14s %03d%n", s, n);
            }

            System.out.println("================================");
        }
    }
}
