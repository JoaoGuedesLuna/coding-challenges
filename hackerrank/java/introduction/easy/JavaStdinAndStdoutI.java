package introduction.easy;

import java.util.Scanner;

/**
 * Platform: HackerRank
 * Challenge: Java Stdin and Stdout I
 * Problem: https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class JavaStdinAndStdoutI {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();
            int n3 = scanner.nextInt();

            System.out.println(n1);
            System.out.println(n2);
            System.out.println(n3);
        }
    }
}
