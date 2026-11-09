package advanced.easy;

import java.util.Locale;
import java.util.Scanner;

/**
 * Platform: HackerRank
 * Challenge: Java Factory Pattern
 * Problem: https://www.hackerrank.com/challenges/java-factory/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class JavaFactoryPattern {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            FoodFactory foodFactory = new FoodFactory();
            Food food = foodFactory.getFood(scanner.next());

            System.out.printf("The factory returned class %s%n", food.getClass().getSimpleName());
            System.out.printf(food.getType());

        }
    }

    private static class FoodFactory {
        public Food getFood(String food) {
            return switch (food.toLowerCase(Locale.ROOT)) {
                case "pizza" -> new Pizza();
                case "cake" -> new Cake();
                default -> throw new RuntimeException("Unknown food type.");
            };
        }
    }

    private interface Food {
        String getType();
    }

    private static class Pizza implements Food {
        public String getType() { return "Someone ordered a Fast Food!"; }
    }

    private static class Cake implements Food {
        public String getType() { return "Someone ordered a Dessert!"; }
    }
}
