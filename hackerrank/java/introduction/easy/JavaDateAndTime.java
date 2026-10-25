package introduction.easy;

import java.util.Calendar;
import java.util.Scanner;

/**
 * Platform: HackerRank
 * Challenge: Java Date and Time
 * Problem: https://www.hackerrank.com/challenges/java-date-and-time/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class JavaDateAndTime {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String s = scanner.nextLine();

            String[] date = s.trim().split("\\s+");

            int month = Integer.parseInt(date[0]);
            int day = Integer.parseInt(date[1]);
            int year = Integer.parseInt(date[2]);

            System.out.println(getDay(month, day, year));
        }
    }

    private static String getDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();

        calendar.set(year, month - 1, day);

        return switch (calendar.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.SUNDAY -> "SUNDAY";
            case Calendar.MONDAY -> "MONDAY";
            case Calendar.TUESDAY -> "TUESDAY";
            case Calendar.WEDNESDAY -> "WEDNESDAY";
            case Calendar.THURSDAY -> "THURSDAY";
            case Calendar.FRIDAY -> "FRIDAY";
            case Calendar.SATURDAY -> "SATURDAY";
            default -> throw new IllegalStateException("Invalid day of week");
        };
    }
}
