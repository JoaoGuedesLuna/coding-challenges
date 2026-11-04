package datastructures.easy;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Platform: HackerRank
 * Challenge: Java Hashset
 * Problem: https://www.hackerrank.com/challenges/java-hashset/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class JavaHashset {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            final int T = scanner.nextInt();

            Set<Set<String>> pairs = new HashSet<>(T);

            for (int i = 0; i < T; i++) {
                Set<String> pair = new HashSet<>(2);

                pair.add(scanner.next());
                pair.add(scanner.next());

                pairs.add(pair);

                System.out.println(pairs.size());
            }

        }
    }
}
