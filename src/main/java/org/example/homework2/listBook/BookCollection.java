package org.example.homework2.listBook;

import java.util.HashSet;


public class BookCollection {
    private HashSet<Book> listBook;

    public BookCollection() {
        this.listBook = new HashSet<>();
    }

    public void addBook(Book book) {
        if (listBook.contains(book)) {
            System.out.println("Такая книга " + book + " уже добавлена ранее");
        } else {
            listBook.add(book);
        }
    }

    public void removeBook(Book book) {
        listBook.remove(book);
    }

    public void clearListBook() {
        listBook.clear();
    }

    public HashSet<Book> getListBook() {
        return listBook;
    }
}