package com.jk.pro;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student
{
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() { return name; }
    public int getScore() { return score; }

    @Override
    public String toString() {
        return name + ": " + score;
    }
}
public class LazyDeveloper25
{
    public static void main(String[] args)
    {
        List<Student> students = Arrays.asList(
                new Student("Jeevan", 85),
                new Student("Amit", 35),
                new Student("Sneha", 92),
                new Student("Rahul", 38),
                new Student("Priya", 45),
                new Student("Kiran", 30)
        );

       Map<Boolean,Long> passFailCount= students
                .stream()
                .collect(Collectors.partitioningBy(s->s.getScore()>=40,
                        Collectors.counting()));

        System.out.println("--- Exam Results Summary ---");
        System.out.println("Passed (Score >= 40): " + passFailCount.get(true));
        System.out.println("Failed (Score < 40): " + passFailCount.get(false));


        List<String> passedStudents=students
                .stream()
                .filter(s->s.getScore() >=40)
                .map(Student::getName)
                .collect(Collectors.toList());

        List<String> failedStudents=students
                .stream()
                .filter(s->s.getScore() < 40)
                .map(Student::getName)
                .collect(Collectors.toList());

        System.out.println("Congrats Students keep it up: " + passedStudents);
        System.out.println("Students don't worry do more Practice to improvement: " + failedStudents);

    }
}
