package objectorientedprogramming.easy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Platform: HackerRank
 * Challenge: Java Iterator
 * Problem: https://www.hackerrank.com/challenges/java-iterator/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class JavaIterator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int n = scanner.nextInt();
            int s = scanner.nextInt();

            List<Object> elements = new ArrayList<>(n + s + 1);

            for (int i = 0; i < n; i++) {
                elements.add(scanner.nextInt());
            }

            elements.add("###");

            for (int i = 0; i < s; i++) {
                elements.add(scanner.next());
            }

            Iterator<Object> iterator = func(elements);

            while (iterator.hasNext()) System.out.println((String) iterator.next());

        }
    }

    private static Iterator<Object> func(List<Object> list) {
        Iterator<Object> iterator = list.iterator();

        while (iterator.hasNext()) {
            Object element = iterator.next();

            if (element instanceof String) {
                iterator.remove();
                break;
            }

            iterator.remove();
        }

        return iterator;
    }
}
