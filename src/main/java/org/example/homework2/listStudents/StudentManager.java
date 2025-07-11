package org.example.homework2.listStudents;

import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> studentsList;
    public ArrayList<Student> getStudentsList() {
        return this.studentsList;
    }
    public StudentManager() {
        this.studentsList = new ArrayList<>();
    }
    public void addStudent(Student student) {
        this.studentsList.add(student);
    }
    Student targetStudent = null;
    public void removeStudent(String idStudent) {
        for (Student student : studentsList) {
            if (student.getIdStudent().equals(idStudent)) {
                targetStudent = student;
            }
        }
        if (targetStudent != null) {
            studentsList.remove(targetStudent);
        } else {
            System.out.println("Студент с id " + idStudent + " не найден");
        }
    }
}