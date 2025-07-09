package org.example.homework.book;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setName("Сказка о царе Салтане");
        book1.setAuthor("Пушкин");
        book1.setYearOfPublication(2025);
        System.out.println("Название1 " + book1.getName());
        System.out.println("Автор1 " + book1.getAuthor());
        System.out.println("Год издания1 " + book1.getYearOfPublication());
        book1.display();
    }
}
