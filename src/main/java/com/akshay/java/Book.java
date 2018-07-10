package com.akshay.java;

import java.util.ArrayList;
import java.util.List;

public class Book implements BookInterface {
    private String bookTitle;
    private float bookPrice;

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public float getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(float bookPrice) {
        this.bookPrice = bookPrice;
    }

    public List<Book> createBooks(int n) {
        List<Book> books = new ArrayList<Book>();
        for (int i =0; i<n;i++){
            Book b = new Book();
            books.add(b);
        }
        return books;
    }

    public void showBooks(List<Book> books) {
        System.out.println("Book_Title\t\t\t" + "Book_Price");
        System.out.println("-------------------------------");
//        for (int i =0; i<books.size();i++)
//        {
//            Book b =books.get(i);
//            System.out.println(b.getBookTitle()+"\t\t\t" + b.getBookPrice());
//        }

        //foreach
        books.forEach(book -> {
            System.out.println(book.getBookTitle()+"\t\t\t" + book.getBookPrice());
        });
    }
}

