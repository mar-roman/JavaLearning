package ru.mirea.inbo0220.markaryants.pr1;
import java.lang.*;

public class Book {
    private String name;
    private String author;
    private int year;

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }
    public Book(String name, String author) {
        this.name = name;
        this.author = author;
        this.year = 0;
    }
    public Book(String name) {
        this.name = name;
        this.author = null;
        this.year = 0;
    }
    public Book() {
        this.name = null;
        this.author = null;
        this.year = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
}
