package exceptionhandling.easy;

import java.util.Scanner;

/**
 * Platform: HackerRank
 * Challenge: Java Exception Handling
 * Problem: https://www.hackerrank.com/challenges/java-exception-handling/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class JavaExceptionHandling {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            MyCalculator calculator = new MyCalculator();

            while (scanner.hasNext()) {
                int n = scanner.nextInt();
                int p = scanner.nextInt();

                try {
                    System.out.println(calculator.power(n, p));
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

        }
    }

    private static class MyCalculator {
        public long power(int n, int p) throws Exception {
            if (n < 0 || p < 0) throw new Exception("java.lang.Exception: n or p should not be negative.");

            if (n == 0 && p == 0) throw new Exception("java.lang.Exception: n and p should not be zero.");

            return (long) Math.pow(n, p);
        }
    }
}
