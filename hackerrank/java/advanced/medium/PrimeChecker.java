package advanced.medium;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Platform: HackerRank
 * Challenge: Prime Checker
 * Problem: https://www.hackerrank.com/challenges/prime-checker/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class PrimeChecker {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();
            int n3 = scanner.nextInt();
            int n4 = scanner.nextInt();
            int n5 = scanner.nextInt();

            Prime prime = new Prime();

            prime.checkPrime(n1);
            prime.checkPrime(n1, n2);
            prime.checkPrime(n1, n2, n3);
            prime.checkPrime(n1, n2, n3, n4);
            prime.checkPrime(n1, n2, n3, n4, n5);

        }
    }

    private static class Prime {
        public void checkPrime(int... numbers) {
            for (int number: numbers) {
                if (BigInteger.valueOf(number).isProbablePrime(100)) {
                    System.out.print(number + " ");
                }
            }
            System.out.println();
        }
    }
}
