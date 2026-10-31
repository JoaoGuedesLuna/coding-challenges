package strings;

import java.util.Scanner;

/**
 * Platform: HackerRank
 * Challenge: Java Substring
 * Problem: https://www.hackerrank.com/challenges/java-substring/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class JavaSubstring {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String s = scanner.next();
            int start = scanner.nextInt();
            int end = scanner.nextInt();

            System.out.printf("%s", s.substring(start, end));
        }
    }
}
