package com.mapsa.busness;

import com.mapsa.exception.LibraryException;
import com.mapsa.models.Book;
import com.mapsa.models.Library;
import com.mapsa.models.Member;

import java.util.Map;
import java.util.Set;

public class LibraryService<T extends Book> {

    Library library;

    public LibraryService(Library library) {
        this.library = library;
    }

    public void addBook(T book) {
        this.library.getBooks().put(book.getTitle(), book);
    }

    public void addMember(Member member) {
        this.library.getMembers().put(member.getId(), member);
    }

    public void checkOutBook(String bookTitle, Long memberId) {
        Map<Long, Member> members = this.library.getMembers();
        Member member = members.get(memberId);

        Map<String, Book> books = this.library.getBooks();
        Book book = books.get(bookTitle);

        member.checkOutBook(book);

    }

    public void returnBook(String bookTitle, Long memberId) throws LibraryException {

        Map<Long, Member> members = this.library.getMembers();
        Member member = members.get(memberId);
        if (member == null) {
            throw new LibraryException("member not found");
        }

        Map<String, Book> books = this.library.getBooks();
        Book book = books.get(bookTitle);
        if (book == null) {
            throw new LibraryException("book not found");
        }

        member.returnBook(book);
    }

    public void countOfMembersCheckoutBooks() {
        int count = 0;

        Map<Long, Member> members = this.library.getMembers();
        Set<Map.Entry<Long, Member>> entries = members.entrySet();
        for (Map.Entry<Long, Member> entry : entries) {
            Member member = entry.getValue();

            if (member.getBooks().size() > 0) {
                System.out.println(member.getName());
            }
        }

    }
}
