package bignumber.medium;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Platform: HackerRank
 * Challenge: Java BigDecimal
 * Problem: https://www.hackerrank.com/challenges/java-bigdecimal/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class JavaBigDecimal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int n = scanner.nextInt();

            String[] s = new String[n];

            for (int i = 0; i < n; i++) {
                s[i] = scanner.next();
            }

            Arrays.stream(s)
                    .sorted((s1, s2) -> new BigDecimal(s2).compareTo(new BigDecimal(s1)))
                    .forEach(System.out::println);

        }
    }
}
