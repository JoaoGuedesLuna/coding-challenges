package strings.medium;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Platform: HackerRank
 * Challenge: Java Regex 2 - Duplicate Words
 * Problem: https://www.hackerrank.com/challenges/duplicate-word/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class JavaRegex2DuplicateWords {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            String regex = "\\b(\\w+)(\\s+\\1\\b)+";
            Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

            int n = scanner.nextInt(); scanner.nextLine();

            for (int i = 0; i < n; i++) {
                String sentence = scanner.nextLine();
                Matcher matcher = pattern.matcher(sentence);

                sentence = matcher.replaceAll("$1");

                System.out.println(sentence);
            }

        }
    }
}
