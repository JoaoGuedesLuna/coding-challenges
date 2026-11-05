package objectorientedprogramming.easy;

import java.util.Scanner;

/**
 * Platform: HackerRank
 * Challenge: Java Abstract Class
 * Problem: https://www.hackerrank.com/challenges/java-abstract-class/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class JavaAbstractClass {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            String title = scanner.nextLine();

            Book book = new MyBook();
            book.setTitle(title);

            System.out.printf("The title is: %s", book.getTitle());

        }
    }

    private static abstract class Book {
        String title;

        public abstract void setTitle(String title);

        public String getTitle() { return title; }
    }

    private static class MyBook extends Book {
        @Override
        public void setTitle(String title) { this.title = title; }
    }
}
