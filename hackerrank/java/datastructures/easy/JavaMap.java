package datastructures.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Platform: HackerRank
 * Challenge: Java Map
 * Problem: https://www.hackerrank.com/challenges/phone-book/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class JavaMap {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int n = scanner.nextInt(); scanner.nextLine();

            Map<String, String> phoneBook = new HashMap<>(n);

            for (int i = 0; i < n; i++) {
                String name = scanner.nextLine();
                String phoneNumber = scanner.next(); scanner.nextLine();

                phoneBook.put(name, phoneNumber);
            }

            while (scanner.hasNextLine()) {
                String query = scanner.nextLine();
                String phoneNumber = phoneBook.get(query);

                System.out.println(phoneNumber != null ? query.concat("=").concat(phoneNumber) : "Not found");
            }

        }
    }
}
