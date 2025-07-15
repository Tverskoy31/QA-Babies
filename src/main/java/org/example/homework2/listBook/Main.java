package org.example.homework2.listBook;

public class Main {
    public static void main(String[] args) {

        BookCollection listBook = new BookCollection();

        Book book1 = new Book("Незнайка и его друзья", "Носов");
        System.out.println("Книга 1 " + book1);
        Book book2 = new Book("Незнайка в солнечном городе", "Носов");
        System.out.println("Книга 2 " + book2);
        Book book3 = new Book("Незнайка на луне", "Носов");
        System.out.println("Книга 3 " + book3);


        System.out.println("Список книг перед добавлением" + listBook.getListBook());
        listBook.addBook(book1);
        listBook.addBook(book2);
        listBook.addBook(book3);
        System.out.println("Список книг после добавления " + listBook.getListBook());

        listBook.removeBook(book2);
        System.out.println("Список после удаления части книг " + listBook.getListBook());

        listBook.clearListBook();
        System.out.println("Список после очистки списка " + listBook.getListBook());

        listBook.addBook(book1);
        listBook.addBook(book2);
        listBook.addBook(book1);
        System.out.println("Список книг после добавления " + listBook.getListBook());

    }
}