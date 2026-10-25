package introduction.easy;

import java.util.Scanner;

/**
 * Platform: HackerRank
 * Challenge: Java End-of-file
 * Problem: https://www.hackerrank.com/challenges/java-end-of-file/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class JavaEndOfFile {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = 0;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.printf("%d %s%n", ++n, line);
            }
        }
    }
}
