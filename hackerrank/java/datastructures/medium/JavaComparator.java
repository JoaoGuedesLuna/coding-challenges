package datastructures.medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Platform: HackerRank
 * Challenge: Java Comparator
 * Problem: https://www.hackerrank.com/challenges/java-comparator/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class JavaComparator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int n = scanner.nextInt(); scanner.nextLine();

            Player[] players = new Player[n];

            for (int i = 0; i < n; i++) {
                String name = scanner.next();
                int score = scanner.nextInt();

                players[i] = new Player(name, score);
            }

            Arrays.sort(players, new Checker());

            for (Player player : players) System.out.println(player);

        }
    }

    private static class Player {
        private String name;
        private int score;

        public Player(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public String getName() { return name; }
        public int getScore() { return score; }

        @Override
        public String toString() { return getName() + " " + getScore(); }
    }

    private static class Checker implements Comparator<Player> {
        @Override
        public int compare(Player player1, Player player2) {
            return Comparator
                    .comparingInt(Player::getScore)
                    .reversed()
                    .thenComparing(Player::getName)
                    .compare(player1, player2);
        }
    }
}
