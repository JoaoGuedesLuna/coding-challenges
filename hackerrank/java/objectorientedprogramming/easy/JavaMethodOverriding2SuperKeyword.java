package objectorientedprogramming.easy;

/**
 * Platform: HackerRank
 * Challenge: Java Method Overriding 2 (Super Keyword)
 * Problem: https://www.hackerrank.com/challenges/java-method-overriding-2-super-keyword/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class JavaMethodOverriding2SuperKeyword {
    public static void main(String[] args) {
        Cycle motorCycle = new MotorCycle();
    }

    private static class Cycle {
        public void define() { System.out.println("a vehicle with pedals."); }
    }

    private static class MotorCycle extends Cycle {
        public MotorCycle() {
            System.out.print("Hello I am a motorcycle, I am ");
            this.define();

            System.out.print("My ancestor is a cycle who is ");
            super.define();
        }

        @Override
        public void define() { System.out.println("a cycle with an engine."); }
    }
}
