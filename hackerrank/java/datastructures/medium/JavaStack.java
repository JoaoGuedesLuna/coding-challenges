package datastructures.medium;

import java.util.Scanner;
import java.util.Stack;

/**
 * Platform: HackerRank
 * Challenge: Java Stack
 * Problem: https://www.hackerrank.com/challenges/java-stack/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class JavaStack {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(isBalanced(line));
            }

        }
    }

    private static boolean isBalanced(String s) {
        if (s == null || s.isEmpty()) return true;

        final String OPENING = "[{(";
        final String CLOSING = "]})";

        Stack<Character> stack = new Stack<>();

        for (char current : s.toCharArray()) {
            int openIndex = OPENING.indexOf(current);

            if (openIndex >= 0) {
                stack.push(CLOSING.charAt(openIndex));
            } else if (CLOSING.indexOf(current) >= 0 && (stack.isEmpty() || stack.pop() != current)) {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
