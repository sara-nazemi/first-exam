package com.mapsa;

import com.mapsa.busness.LibraryService;
import com.mapsa.models.*;
import com.mapsa.models.Math;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, Book> books = new HashMap<>();

        Map<Long, Member> members = new HashMap<>();


        books.put("a", new Math("a", "m", 1980));
        books.put("b", new History("b", "n", 1870));
        books.put("c", new History("c", "k", 2000));


        members.put(345L, new Member(345L, "sara"));
        members.put(346L, new Member(346L, "ali"));
        members.put(347L, new Member(347L, "maryam"));

        Library library = new Library(books, members);

        Member member = new Member();

        member.returnBook(new Math("a", "m", 1980));
        member.checkOutBook(new Math("a", "m", 1980));

        member.returnBook(new History("b", "n", 1870));
        member.returnBook(new History("b", "n", 1870));

        LibraryService libraryService = new LibraryService(library);

        libraryService.returnBook("a", 346L);
        libraryService.checkOutBook("b", 345L);

        libraryService.countOfMembersCheckoutBooks();


    }
}