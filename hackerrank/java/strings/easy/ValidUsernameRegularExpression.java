package strings.easy;

import java.util.Scanner;

/**
 * Platform: HackerRank
 * Challenge: Valid Username Regular Expression
 * Problem: https://www.hackerrank.com/challenges/valid-username-checker/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class ValidUsernameRegularExpression {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int n = scanner.nextInt(); scanner.nextLine();

            String regularExpression = "^[a-zA-Z][\\w]{7,29}$";

            for (int i = 0; i < n; i++) {
                String username = scanner.nextLine();

                String result = username.trim()
                        .matches(regularExpression) ? "Valid" : "Invalid";

                System.out.println(result);
            }

        }
    }
}
