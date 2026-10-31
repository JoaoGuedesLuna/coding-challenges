package strings;

import java.util.Scanner;

/**
 * Platform: HackerRank
 * Challenge: Java Anagrams
 * Problem: https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class JavaAnagrams {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            String a = scanner.next();
            String b = scanner.next();

            System.out.println(isAnagram(a, b) ? "Anagrams" : "Not Anagrams");

        }
    }

    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;

        String aLower = a.toLowerCase();
        String bLower = b.toLowerCase();

        int[] frequencies = new int[26];

        for (int i = 0; i < aLower.length(); i++) {
            frequencies[aLower.charAt(i) - 'a']++;
            frequencies[bLower.charAt(i) - 'a']--;
        }

        for (int frequency : frequencies) {
            if (frequency != 0) return false;
        }

        return true;
    }
}
