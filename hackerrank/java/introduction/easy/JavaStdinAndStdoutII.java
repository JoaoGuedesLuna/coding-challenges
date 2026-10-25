package introduction.easy;

import java.util.Scanner;

/**
 * Platform: HackerRank
 * Challenge: Java Stdin and Stdout II
 * Problem: https://www.hackerrank.com/challenges/java-stdin-stdout/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class JavaStdinAndStdoutII {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int anInt = scanner.nextInt();
            double aDouble = scanner.nextDouble(); scanner.nextLine();
            String aString = scanner.nextLine();

            System.out.println("String: " + aString);
            System.out.println("Double: " + aDouble);
            System.out.println("Int: " + anInt);
        }
    }
}
