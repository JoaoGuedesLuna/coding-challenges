package strings.medium;

import java.util.Scanner;

/**
 * Platform: HackerRank
 * Challenge: Java Regex
 * Problem: https://www.hackerrank.com/challenges/java-regex/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class JavaRegex {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            while (scanner.hasNext()) {
                String ip = scanner.next();
                System.out.println(ip.matches(new MyRegex().pattern));
            }

        }
    }

    private static class MyRegex {
        public String pattern =  "^((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]{1,2}|0[0-9]{1,2})\\.){3}" +
                "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]{1,2}|0[0-9]{1,2})$";
    }
}
