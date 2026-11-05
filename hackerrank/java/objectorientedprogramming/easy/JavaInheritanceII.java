package objectorientedprogramming.easy;

/**
 * Platform: HackerRank
 * Challenge: Java Inheritance II
 * Problem: https://www.hackerrank.com/challenges/java-inheritance-2/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class JavaInheritanceII {
    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.printf("My superclass is: %s%n", adder.getClass().getSuperclass().getSimpleName());
        System.out.printf("%d %d %d", adder.add(10, 32), adder.add(10, 3), adder.add(10, 10));
    }

    private static class Arithmetic {
        public int add(int x, int y) { return x + y; }
    }

    private static class Adder extends Arithmetic {}
}
