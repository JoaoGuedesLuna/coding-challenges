package exceptionhandling.easy;

import java.util.Scanner;

/**
 * Platform: HackerRank
 * Challenge: Java Exception Handling (Try-catch)
 * Problem: https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class JavaExceptionHandlingTrycatch {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            String input1 = scanner.nextLine();
            String input2 = scanner.nextLine();

            int x;
            int y;

            try {
                x = Integer.parseInt(input1);
                y = Integer.parseInt(input2);

                System.out.println(x / y);
            }
            catch (NumberFormatException e) {
                System.out.println("java.util.InputMismatchException");
            }
            catch (ArithmeticException e) {
                System.out.println("java.lang.ArithmeticException: / by zero");
            }

        }
    }
}
