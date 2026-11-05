package objectorientedprogramming.easy;

/**
 * Platform: HackerRank
 * Challenge: Java Inheritance I
 * Problem: https://www.hackerrank.com/challenges/java-inheritance-1/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class JavaInheritanceI {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
    }

    private static class Animal {
        public void walk() { System.out.println("I am walking"); }
    }

    private static class Bird extends Animal {
        public void fly() { System.out.println("I am flying"); }
        public void sing() { System.out.println("I am singing"); }
    }
}
