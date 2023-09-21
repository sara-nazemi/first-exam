package com.mapsa.models;

import java.util.ArrayList;
import java.util.List;

public class Member {

    private Long id;
    private String name;
    /**
     * write another field for represent the books of member
     * and complete these methods to add and remove book from this field
     */
    private List<Book> books = new ArrayList<>();

    public Member() {
    }

    public Member(Long id, String name) {
        this.id = id;
        this.name = name;

    }

    public Member(Long id, List<Book> books) {
        this.id = id;
        this.books = books;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void checkOutBook(Book book) {
        books.add(book);
    }

    public void returnBook(Book book) {
        books.remove(book);

    }
}
