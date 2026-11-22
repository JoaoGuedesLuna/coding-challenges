package datastructures.medium;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 * Platform: HackerRank
 * Challenge: Java Priority Queue
 * Problem: https://www.hackerrank.com/challenges/java-priority-queue/problem?isFullScreen=true
 *
 * @author João Guedes (https://github.com/JoaoGuedesLuna)
 */
public class JavaPriorityQueue {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int n = scanner.nextInt(); scanner.nextLine();

            List<String> events = new ArrayList<>();

            for (int i = 0; i < n; i++) events.add(scanner.nextLine().trim());

            Priorities priorities = new Priorities();
            List<Student> students = priorities.getStudents(events);

            if (students.isEmpty()) {
                System.out.println("EMPTY");
            } else {
                students.forEach(student -> System.out.println(student.getName()));
            }

        }
    }

    private static class Student implements Comparable<Student> {
        private final int id;
        private final String name;
        private final double cgpa;

        public Student(int id, String name, double cgpa) {
            this.id = id;
            this.name = name;
            this.cgpa = cgpa;
        }

        public int getId() { return id; }
        public String getName() { return name; }
        public double getCgpa() { return cgpa; }

        @Override
        public int compareTo(Student student) {
            return Comparator.comparingDouble(Student::getCgpa)
                    .reversed()
                    .thenComparing(Student::getName)
                    .thenComparingInt(Student::getId)
                    .compare(this, student);
        }
    }

    private static class Priorities {
        public List<Student> getStudents(List<String> events) {
            Queue<Student> queue = new PriorityQueue<>();

            for (String eventLine : events) {
                if (eventLine.isEmpty()) continue;

                String[] parts = eventLine.split("\\s+");

                if (parts[0].equals("ENTER")) {
                    String name = parts[1];
                    double cgpa = Double.parseDouble(parts[2]);
                    int id = Integer.parseInt(parts[3]);
                    queue.offer(new Student(id, name, cgpa));
                } else if (parts[0].equals("SERVED")) {
                    queue.poll();
                }
            }

            List<Student> remainingStudents = new ArrayList<>();

            while (!queue.isEmpty()) remainingStudents.add(queue.poll());

            return remainingStudents;
        }
    }
}
