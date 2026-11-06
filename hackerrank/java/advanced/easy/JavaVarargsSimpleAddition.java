package advanced.easy;

import java.util.Scanner;

/**
 * Platform: HackerRank
 * Challenge: Java Varargs - Simple Addition
 * Problem: https://www.hackerrank.com/challenges/simple-addition-varargs/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class JavaVarargsSimpleAddition {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();
            int n3 = scanner.nextInt();
            int n4 = scanner.nextInt();
            int n5 = scanner.nextInt();
            int n6 = scanner.nextInt();

            Add add = new Add();

            add.add(n1, n2);
            add.add(n1, n2, n3);
            add.add(n1, n2, n3, n4, n5);
            add.add(n1, n2, n3, n4, n5, n6);

        }
    }

    private static class Add {
        public void add(int... numbers) {
            if (numbers.length == 0) return;

            long sum = numbers[0];
            StringBuilder sb = new StringBuilder(String.valueOf(numbers[0]));

            for (int i = 1; i < numbers.length; i++) {
                sb.append("+").append(numbers[i]);
                sum += numbers[i];
            }

            System.out.printf("%s=%d%n", sb, sum);
        }
    }
}
