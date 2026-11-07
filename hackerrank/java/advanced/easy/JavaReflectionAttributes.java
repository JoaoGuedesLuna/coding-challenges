package advanced.easy;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Platform: HackerRank
 * Challenge: Java Reflection - Attributes
 * Problem: https://www.hackerrank.com/challenges/java-reflection-attributes/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class JavaReflectionAttributes {
    public static void main(String[] args) {
        Arrays.stream(Student.class.getDeclaredMethods())
                .map(Method::getName)
                .sorted()
                .forEach(System.out::println);
    }

    private static class Student {
        private String id;
        private String name;
        private String email;

        public String getId() { return id; }
        public void setId(String id) { this.id = id; }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }

        public void anotherMethod() {}
    }
}
