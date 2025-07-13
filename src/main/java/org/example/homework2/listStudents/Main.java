package org.example.homework2.listStudents;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Pit", "id_Pit");
        System.out.println(student1.toString());

        Student student2 = new Student("Jon", "id_Jon");
        System.out.println(student2.toString());

        StudentManager studentManager = new StudentManager();
        studentManager.addStudent(student1);
        studentManager.addStudent(student2);
        System.out.println("StudentsList с add" + studentManager.getStudentsList());
        studentManager.removeStudent("id1_Jon");
        System.out.println("StudentsList с remove" + studentManager.getStudentsList());
    }
}
