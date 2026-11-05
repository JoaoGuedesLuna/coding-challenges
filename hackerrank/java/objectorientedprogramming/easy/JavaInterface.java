package objectorientedprogramming.easy;

import java.util.Scanner;

/**
 * Platform: HackerRank
 * Challenge: Java Interface
 * Problem: https://www.hackerrank.com/challenges/java-interface/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class JavaInterface {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int n = scanner.nextInt();

            AdvancedArithmetic advancedArithmetic = new MyCalculator();

            System.out.printf("I implemented: %s%n", advancedArithmetic.getClass().getInterfaces()[0].getSimpleName());
            System.out.printf("%d", advancedArithmetic.divisorSum(n));

        }
    }

    private interface AdvancedArithmetic {
        int divisorSum(int n);
    }

    private static class MyCalculator implements AdvancedArithmetic {
        @Override
        public int divisorSum(int n) {
            int sum = 0;
            int i = 1;

            for (; i * i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                    sum += n / i;
                }
            }

            if (i * i == n) sum += i;

            return sum;
        }
    }
}
