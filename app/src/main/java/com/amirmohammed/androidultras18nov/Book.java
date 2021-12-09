package com.amirmohammed.androidultras18nov;

public class Book {

    // Global Variables
    String bookName;
    String bookPrice;
    String bookAuthor;
    String bookPagesCount;
    String bookCategory;

    // Constructor
    public Book(String bookName,String bookPrice, String bookAuthor, String bookPagesCount, String bookCategory){
        //Local Variables
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.bookAuthor = bookAuthor;
        this.bookPagesCount = bookPagesCount;
        this.bookCategory = bookCategory;

        printBookData();
    }

    void data(String bookName,String bookPrice, String bookAuthor, String bookPagesCount, String bookCategory){
        //Local Variables
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.bookAuthor = bookAuthor;
        this.bookPagesCount = bookPagesCount;
        this.bookCategory = bookCategory;
    }

    void printBookData() {
        System.out.println(bookName);
        System.out.println(bookPrice);
        System.out.println(bookAuthor);
        System.out.println(bookPagesCount);
        System.out.println(bookCategory);
    }

}
