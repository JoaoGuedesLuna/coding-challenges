package introduction.easy;

import java.util.Scanner;

/**
 * Platform: HackerRank
 * Challenge: Java Loops II
 * Problem: https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class JavaLoopsII {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int q = scanner.nextInt();

            while (q-- > 0) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int n = scanner.nextInt();

                int serie = a;
                int term = b;

                for (int i = 0; i < n; i++) {
                    serie += term;
                    System.out.print(serie + " ");
                    term <<= 1;
                }

                System.out.println();
            }
        }
    }
}
