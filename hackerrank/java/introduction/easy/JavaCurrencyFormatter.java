package introduction.easy;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Platform: HackerRank
 * Challenge: Java Currency Formatter
 * Problem: https://www.hackerrank.com/challenges/java-currency-formatter/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class JavaCurrencyFormatter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double payment = scanner.nextDouble();

            NumberFormat usNumberFormat = NumberFormat.getCurrencyInstance(Locale.US);
            NumberFormat indiaNumberFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
            NumberFormat chinaNumberFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
            NumberFormat franceNumberFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);

            String usPayment = usNumberFormat.format(payment);
            String indiaPayment =indiaNumberFormat.format(payment).replace("\u20B9", "Rs.");
            String chinaPayment = chinaNumberFormat.format(payment).replace("\u00A5", "\uFFE5");
            String francePayment = franceNumberFormat.format(payment).replace("\u202F", "\u00A0").replace("\u00A0\u20AC", " \u20AC");

            System.out.printf("US: %s%n", usPayment);
            System.out.printf("India: %s%n", indiaPayment);
            System.out.printf("China: %s%n", chinaPayment);
            System.out.printf("France: %s%n", francePayment);
        }
    }
}
