package strings;

import java.util.Scanner;

/**
 * Platform: HackerRank
 * Challenge: Java Strings Introduction
 * Problem: https://www.hackerrank.com/challenges/java-strings-introduction/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class JavaStringsIntroduction {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String a = scanner.nextLine();
            String b = scanner.nextLine();

            System.out.println(a.length() + b.length());

            System.out.println(a.compareTo(b) > 0 ? "Yes" : "No");

            System.out.printf(
                    "%s %s",
                    Character.toUpperCase(a.charAt(0)) + a.substring(1),
                    Character.toUpperCase(b.charAt(0)) + b.substring(1)
                    );
        }
    }
}
