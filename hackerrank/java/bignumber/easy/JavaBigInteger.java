package bignumber.easy;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Platform: HackerRank
 * Challenge:Java BigInteger
 * Problem: https://www.hackerrank.com/challenges/java-biginteger/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class JavaBigInteger {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            BigInteger a = scanner.nextBigInteger();
            BigInteger b = scanner.nextBigInteger();

            System.out.println(a.add(b));
            System.out.println(a.multiply(b));

        }
    }
}
