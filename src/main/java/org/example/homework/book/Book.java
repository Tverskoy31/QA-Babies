package org.example.homework.book;

public class Book implements Displayable {

    private String name;
    private String author;
    private int yearOfPublication;

    public String getName (){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getAuthor (){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public int getYearOfPublication (){
        return yearOfPublication;
    }
    public void setYearOfPublication(int yearOfPublication){
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public void display() {
        System.out.println("Название2 " + this.name);
        System.out.println("Автор2 " + this.author);
        System.out.println("Год издания2 " + this.yearOfPublication);
    }
}

