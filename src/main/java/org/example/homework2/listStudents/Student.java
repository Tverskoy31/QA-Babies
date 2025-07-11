package org.example.homework2.listStudents;

public class Student {
    private String nameStudent;
    private String idStudent;

    public String getIdStudent() {
        return idStudent;
    }

    public Student(String nameStudent, String idStudent) {
        this.nameStudent = nameStudent;
        this.idStudent = idStudent;
    }
    @Override
    public String toString() {
        return "Student{" +
            "nameStudent='" + nameStudent + '\'' +
            ", idStudent='" + idStudent + '\'' +
            '}';
    }
}
