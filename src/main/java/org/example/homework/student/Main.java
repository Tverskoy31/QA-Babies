package org.example.homework.student;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Женя");
        student1.setNumberGradeBook(123454321);
        student1.setAverageScore(4);
        System.out.println("Имя студента1 " + student1.getName());
        System.out.println("Номер зачетной1 книжки " + student1.getNumberGradeBook());
        System.out.println("Средний балл1 " + student1.getAverageScore());
        student1.print();
    }
}
