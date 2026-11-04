package datastructures.easy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * Platform: HackerRank
 * Challenge: Java Sort
 * Problem: https://www.hackerrank.com/challenges/java-sort/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class JavaSort {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            final int N = scanner.nextInt();

            List<Student> students = new ArrayList<>(N);

            for (int i = 0; i < N; i++) {
                int id = scanner.nextInt();
                String firstName = scanner.next();
                double cgpa = scanner.nextDouble();

                students.add(new Student(id, firstName, cgpa));
            }

            Comparator<Student> comparator = Comparator
                    .comparingDouble(Student::getCgpa).reversed()
                    .thenComparing(Student::getFirstName)
                    .thenComparing(Student::getId);

            students.sort(comparator);

            students.forEach(student -> System.out.println(student.getFirstName()));

        }
    }

    private static class Student {
        private int id;
        private String firstName;
        private double cgpa;

        public Student(int id, String firstName, double cgpa) {
            this.id = id;
            this.firstName = firstName;
            this.cgpa = cgpa;
        }

        public int getId() { return id; }
        public void setId(int id) { this.id = id; }

        public String getFirstName() { return firstName; }
        public void setFirstName(String firstName) { this.firstName = firstName; }

        public double getCgpa() { return cgpa; }
        public void setCgpa(double cgpa) { this.cgpa = cgpa; }
    }
}
