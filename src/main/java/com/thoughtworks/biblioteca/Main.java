package com.thoughtworks.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) throws IOException {
        Collection<Book> bookList = new ArrayList<Book>();
        PrintStream printStream = System.out;
        bookList.add(new Book(printStream, "Book one", "author", "year"));
        Library library = new Library(bookList);

        BufferedReader bufferedReader = new BufferedReader((new InputStreamReader(System.in)));
        Menu menu = new Menu(printStream, bufferedReader, library);


        new Application(printStream, library, menu).start();
    }

}
