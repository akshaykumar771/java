package com.akshay.java;

import java.util.List;

public class TestBook {
    public static void main(String[] args) {
        Book book = new Book();
        //Creating Books
        List<Book> books = book.createBooks(2);

        //Set values
        Book book1 = books.get(0);
        Book book2 = books.get(1);
        book1.setBookTitle("JavaProgramming");
        book1.setBookPrice(350.50f);
        book2.setBookTitle("Let Us C");
        book2.setBookPrice(250.0f);


        //Display
        book.showBooks(books);
    }
}
