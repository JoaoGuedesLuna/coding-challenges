package strings.easy;

import java.util.Scanner;

/**
 * Platform: HackerRank
 * Challenge: Java String Tokens
 * Problem: https://www.hackerrank.com/challenges/java-string-tokens/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class JavaStringTokens {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            String s = scanner.nextLine();

            String[] tokens = s.split("[^a-zA-Z]+");

            int tokenCount = 0;

            for (String token : tokens) {
                if (!token.isEmpty()) tokenCount++;
            }

            System.out.println(tokenCount);

            for (String token : tokens) {
                if (!token.isEmpty()) System.out.println(token);
            }

        }
    }
}
