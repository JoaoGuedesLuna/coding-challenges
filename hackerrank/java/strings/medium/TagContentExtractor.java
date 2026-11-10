package strings.medium;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Platform: HackerRank
 * Challenge: Tag Content Extractor
 * Problem: https://www.hackerrank.com/challenges/tag-content-extractor/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class TagContentExtractor {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            String regex = "<([^>]+)>([^<>]+)</\\1>";
            Pattern pattern = Pattern.compile(regex);

            final int N = scanner.nextInt(); scanner.nextLine();

            for (int i = 0; i < N; i++) {
                String line = scanner.nextLine();
                Matcher matcher = pattern.matcher(line);

                boolean found = false;

                while (matcher.find()) {
                    System.out.println(matcher.group(2));
                    found = true;
                }

                if (!found) System.out.println("None");
            }

        }
    }
}
