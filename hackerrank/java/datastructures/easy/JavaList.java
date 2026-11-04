package datastructures.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Platform: HackerRank
 * Challenge: Java list
 * Problem: https://www.hackerrank.com/challenges/java-list/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class JavaList {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            final int N = scanner.nextInt();

            final List<Integer> L = new ArrayList<>(N);

            for (int i = 0; i < N; i++) {
                L.add(scanner.nextInt());
            }

            final int Q = scanner.nextInt();

            for (int i = 0; i < Q; i++) {
                String operation = scanner.next();

                if (operation.equalsIgnoreCase("Insert")) {
                    int x = scanner.nextInt();
                    int y = scanner.nextInt();
                    L.add(x, y);
                } else if (operation.equalsIgnoreCase("Delete")) {
                    int x = scanner.nextInt();
                    L.remove(x);
                }
            }

            L.forEach(element -> System.out.printf("%d ", element));

        }
    }
}
