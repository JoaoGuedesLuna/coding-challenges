package objectorientedprogramming.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 * Platform: HackerRank
 * Challenge: Java Instanceof keyword
 * Problem: https://www.hackerrank.com/challenges/java-instanceof-keyword/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class JavaInstanceOfKeyword {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int t = scanner.nextInt();

            List<Object> instances = new ArrayList<>(t);

            for (int i = 0; i < t; i++) {
                String className = scanner.next();

                switch (className.trim().toUpperCase(Locale.ROOT)) {
                    case "STUDENT" -> instances.add(new Student());
                    case "ROCKSTAR" -> instances.add(new Rockstar());
                    case "HACKER" -> instances.add(new Hacker());
                }
            }

            System.out.println(count(instances));

        }
    }

    private static String count(List<Object> instances) {
        int studentCount = 0;
        int rockstarCount = 0;
        int hackerCount = 0;

        for (Object instance : instances) {
            if (instance instanceof Student) studentCount++;
            if (instance instanceof Rockstar) rockstarCount++;
            if (instance instanceof Hacker) hackerCount++;
        }

        return String.format("%d %d %d", studentCount, rockstarCount, hackerCount);
    }

    private static class Student {}
    private static class Rockstar {}
    private static class Hacker {}
}
