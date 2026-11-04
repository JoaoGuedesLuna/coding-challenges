package datastructures.easy;

/**
 * Platform: HackerRank
 * Challenge: Java Generics
 * Problem: https://www.hackerrank.com/challenges/java-generics/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class JavaGenerics {
    public static void main(String[] args) {
        Integer[] integerArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};

        printArray(integerArray);
        printArray(stringArray);
    }

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}
