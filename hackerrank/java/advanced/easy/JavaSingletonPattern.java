package advanced.easy;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Scanner;

/**
 * Platform: HackerRank
 * Challenge: Java Singleton Pattern
 * Problem: https://www.hackerrank.com/challenges/java-singleton/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class JavaSingletonPattern {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            Singleton singleton1 = Singleton.getInstance();
            Singleton singleton2 = Singleton.getInstance();

            assert(singleton1 == singleton2);

            Class<Singleton> singletonClass = Singleton.class;
            Constructor<Singleton>[] constructors = (Constructor<Singleton>[]) singletonClass.getDeclaredConstructors();

            assert(constructors.length == 1);

            for (Constructor<Singleton> constructor : constructors) {
                if (!Modifier.isPrivate(constructor.getModifiers()) || constructor.toString().equals("private Singleton()")) {
                    System.out.println("Wrong class!");
                }
            }

            String str = scanner.nextLine();

            singleton1.str = str;
            singleton2.str = str;

            System.out.printf("Hello I am a singleton! Let me say %s to you%n", str);
        }
    }

    private static class Singleton {
        public String str;

        private static Singleton instance;

        private Singleton() {}

        private static Singleton getInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }
    }
}
