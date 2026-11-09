package advanced.easy;

import java.util.Locale;
import java.util.Scanner;

/**
 * Platform: HackerRank
 * Challenge: Covariant Return Types
 * Problem: https://www.hackerrank.com/challenges/java-covariance/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class CovariantReturnTypes {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            String state = scanner.nextLine();

            Flower flower = switch (state.toLowerCase(Locale.ROOT)) {
                case "westbengal" -> new WestBengal().yourNationalFlower();
                case "andhrapradesh" -> new AndhraPradesh().yourNationalFlower();
                default -> throw new RuntimeException("Unknown state.");
            };

            System.out.println(flower.whatsYourName());

        }
    }

    private static class Flower {
        public String whatsYourName() { return "I have many names and types."; }
    }

    private static class Jasmine extends Flower {
        @Override
        public String whatsYourName() { return "Jasmine"; }
    }

    private static class Lily extends Flower {
        @Override
        public String whatsYourName() { return "Lily"; }
    }

    private abstract static class Region {
        public abstract Flower yourNationalFlower();
    }

    private static class WestBengal extends Region {
        @Override
        public Flower yourNationalFlower() { return new Jasmine(); }
    }

    private static class AndhraPradesh extends Region {
        @Override
        public Flower yourNationalFlower() { return new Lily(); }
    }
}
