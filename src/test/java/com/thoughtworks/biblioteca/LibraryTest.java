package com.thoughtworks.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class LibraryTest {

    private Library library;
    private Collection<Book> books;
    private Book book;

    @Before
    public void setUp(){
        books = new ArrayList<Book>();
        library = new Library(books);

        book = mock(Book.class);
    }

    @Test
    public void shouldPrintABook(){
        books.add(book);
        library.printBooks();
        verify(book).printBookDetails();
    }

    @Test
    public void ShouldPrintTwoBooksWhenGivenTwoBooks(){
        Book book2 = mock(Book.class);
        books.add(book);
        books.add(book2);

        library.printBooks();

        verify(book2).printBookDetails();
    }
}