package com.mapsa.models;

import java.util.HashMap;
import java.util.Map;

public class Library {

    private Map<String, Book> books = new HashMap<>();
    private Map<Long, Member> members = new HashMap<>();

    public Library() {
    }

    public Library(Map<String, Book> books, Map<Long, Member> members) {
        this.books = books;
        this.members = members;
    }

    public Map<String, Book> getBooks() {
        return books;
    }

    public void setBooks(Map<String, Book> books) {
        this.books = books;
    }

    public Map<Long, Member> getMembers() {
        return members;
    }

    public void setMembers(Map<Long, Member> members) {
        this.members = members;
    }
}
