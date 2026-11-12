package datastructures.medium;

import java.util.Scanner;

/**
 * Platform: HackerRank
 * Challenge: Java 1D Array (Part 2)
 * Problem: https://www.hackerrank.com/challenges/java-1d-array/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class Java1DArrayPart2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int q = scanner.nextInt();

            for (int i = 0; i < q; i++) {
                int n = scanner.nextInt();
                int leap = scanner.nextInt();

                int[] game = new int[n];

                for (int j = 0; j < n; j++) game[j] = scanner.nextInt();

                System.out.println(canWin(leap, game) ? "YES" : "NO");
            }

        }
    }

    public static boolean canWin(int leap, int[] game) { return canWin(leap, game, 0); }

    private static boolean canWin(int leap, int[] game, int index) {
        if (index >= game.length) return true;

        if (index < 0 || game[index] == 1) return false;

        game[index] = 1;

        return canWin(leap, game, index + leap)
                || canWin(leap, game, index + 1)
                || canWin(leap, game, index - 1);
    }
}
