package org.example.homework.student;

public class Student implements Printable {
    private String name;
    private int numberGradeBook;
    private int averageScore;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberGradeBook() {
        return numberGradeBook;
    }

    public void setNumberGradeBook(int numberGradeBook) {
        this.numberGradeBook = numberGradeBook;
    }

    public int getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(int averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public void print() {
        System.out.printf("Имя студента2 " + this.name);
        System.out.printf("Номер зачетной2 книжки " + this.numberGradeBook);
        System.out.printf("Средний балл2 " + this.averageScore);
    }
}
