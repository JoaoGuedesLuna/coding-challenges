package datastructures.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Platform: HackerRank
 * Challenge: Java Arraylist
 * Problem: https://www.hackerrank.com/challenges/java-arraylist/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class JavaArraylist {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int n = scanner.nextInt();

            List<List<Integer>> lines = new ArrayList<>(5);

            for (int i = 0; i < n; i++) {
                int d = scanner.nextInt();

                List<Integer> line = new ArrayList<>();

                for (int j = 0; j < d; j++) {
                    line.add(scanner.nextInt());
                }

                lines.add(line);
            }

            int q = scanner.nextInt();

            for (int i = 0; i < q; i++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();

                if (x >= 1 && x <= lines.size() && y >= 1 && y <= lines.get(x - 1).size()) {
                    System.out.println(lines.get(x - 1).get(y - 1));
                } else {
                    System.out.println("ERROR!");
                }
            }

        }
    }
}
