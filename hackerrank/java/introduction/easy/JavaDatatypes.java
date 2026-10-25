package introduction.easy;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Platform: HackerRank
 * Challenge: Java Datatypes
 * Problem: https://www.hackerrank.com/challenges/java-datatypes/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class JavaDatatypes {
    private static final BigInteger BYTE_MIN = BigInteger.valueOf(Byte.MIN_VALUE);
    private static final BigInteger BYTE_MAX = BigInteger.valueOf(Byte.MAX_VALUE);
    private static final BigInteger SHORT_MIN = BigInteger.valueOf(Short.MIN_VALUE);
    private static final BigInteger SHORT_MAX = BigInteger.valueOf(Short.MAX_VALUE);
    private static final BigInteger INT_MIN = BigInteger.valueOf(Integer.MIN_VALUE);
    private static final BigInteger INT_MAX = BigInteger.valueOf(Integer.MAX_VALUE);
    private static final BigInteger LONG_MIN = BigInteger.valueOf(Long.MIN_VALUE);
    private static final BigInteger LONG_MAX = BigInteger.valueOf(Long.MAX_VALUE);

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int t = scanner.nextInt();

            for (int i = 0; i < t; i++) {
                BigInteger n = scanner.nextBigInteger();

                if (n.compareTo(BYTE_MIN) >= 0 && n.compareTo(BYTE_MAX) <= 0) System.out.printf("%d can be fitted in:%n* byte%n* short%n* int%n* long%n", n);

                else if (n.compareTo(SHORT_MIN) >= 0 && n.compareTo(SHORT_MAX) <= 0) System.out.printf("%d can be fitted in:%n* short%n* int%n* long%n", n);

                else if (n.compareTo(INT_MIN) >= 0 && n.compareTo(INT_MAX) <= 0) System.out.printf("%d can be fitted in:%n* int%n* long%n", n);

                else if (n.compareTo(LONG_MIN) >= 0 && n.compareTo(LONG_MAX) <= 0) System.out.printf("%d can be fitted in:%n* long%n", n);

                else System.out.printf("%d can't be fitted anywhere.%n", n);
            }
        }
    }
}
