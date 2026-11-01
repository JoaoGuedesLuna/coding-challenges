package strings.easy;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Platform: HackerRank
 * Challenge: Pattern Syntax Checker
 * Problem: https://www.hackerrank.com/challenges/pattern-syntax-checker/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class PatternSyntaxChecker {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            final int N = scanner.nextInt(); scanner.nextLine();

            for (int i = 0; i < N; i++) {
               String pattern = scanner.nextLine();

               try {
                   Pattern.compile(pattern);
                   System.out.println("Valid");
               } catch (PatternSyntaxException e) {
                   System.out.println("Invalid");
               }
            }

        }
    }
}
