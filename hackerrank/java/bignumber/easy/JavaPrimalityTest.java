package bignumber.easy;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Platform: HackerRank
 * Challenge: Java Primality Test
 * Problem: https://www.hackerrank.com/challenges/java-primality-test/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class JavaPrimalityTest {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            BigInteger n = scanner.nextBigInteger();

            System.out.println(n.isProbablePrime(100) ? "prime" : "not prime");

        }
    }
}
