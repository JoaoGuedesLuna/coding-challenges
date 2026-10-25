package introduction.easy;

import java.util.Scanner;

/**
 * Platform: HackerRank
 * Challenge: Java Static Initializer Block
 * Problem: https://www.hackerrank.com/challenges/java-static-initializer-block/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class JavaStaticInitializerBlock {
    static {
        try (Scanner scanner = new Scanner(System.in)) {
            int b = scanner.nextInt();
            int h = scanner.nextInt();

            if (b <= 0 || h <= 0){
                System.out.println("java.lang.Exception: Breadth and height must be positive");
            } else {
                System.out.println(b * h);
            }
        }
    }

    public static void main(String[] args) {}
}
