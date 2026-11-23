package datastructures.medium;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Platform: HackerRank
 * Challenge: Java Dequeue
 * Problem: https://www.hackerrank.com/challenges/java-dequeue/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class JavaDequeue {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            final int N = scanner.nextInt();
            final int M = scanner.nextInt();

            Deque<Integer> deque = new ArrayDeque<>();
            Map<Integer, Integer> frequencies = new HashMap<>();

            int maxUnique = 0;

            for (int i = 0; i < N; i++) {
                int current = scanner.nextInt();

                deque.offerLast(current);
                frequencies.put(current, frequencies.getOrDefault(current, 0) + 1);

                if (deque.size() > M) {
                    int removed = deque.removeFirst();
                    int frequency = frequencies.get(removed);

                    if (frequency == 1) {
                        frequencies.remove(removed);
                    } else {
                        frequencies.put(removed, frequency - 1);
                    }
                }

                if (deque.size() == M) {
                    maxUnique = Math.max(maxUnique, frequencies.size());

                    if (frequencies.size() == M) {
                        break;
                    }
                }
            }

            System.out.println(maxUnique);

        }
    }
}
