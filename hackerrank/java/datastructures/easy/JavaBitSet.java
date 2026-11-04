package datastructures.easy;

import java.util.BitSet;
import java.util.Scanner;

/**
 * Platform: HackerRank
 * Challenge: Java BitSet
 * Problem: https://www.hackerrank.com/challenges/java-bitset/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class JavaBitSet {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            final int N = scanner.nextInt();
            final int M = scanner.nextInt();

            final BitSet B1 = new BitSet(N);
            final BitSet B2 = new BitSet(N);

            BitSet[] bitSets = {null, B1, B2};

            for (int i = 0; i < M; i++) {
                String operation = scanner.next();

                int x = scanner.nextInt();
                int y = scanner.nextInt();

                switch (operation) {
                    case "AND" -> bitSets[x].and(bitSets[y]);
                    case "OR" -> bitSets[x].or(bitSets[y]);
                    case "XOR" -> bitSets[x].xor(bitSets[y]);
                    case "FLIP" -> bitSets[x].flip(y);
                    case "SET" -> bitSets[x].set(y);
                }

                System.out.printf("%d %d%n", bitSets[1].cardinality(), bitSets[2].cardinality());
            }

        }
    }
}
