package com.amirmohammed.androidultras18nov.models;

// Access Modifiers => public , private , protected, package private
// Non access modifiers => final , static , abstract

public class Book {

    // Global Variables
    private String bookName;
    private int bookPrice;
    private String bookAuthor;
    private String bookPagesCount;
    private String bookCategory;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookPagesCount() {
        return bookPagesCount;
    }

    public void setBookPagesCount(String bookPagesCount) {
        this.bookPagesCount = bookPagesCount;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public String getBookPriceDollar() {
        return bookPrice + " $";
    }

    public void setBookPrice(int bookPrice) {
        if (bookPrice < 1) {
            System.out.println("Error => book price must at lease 1$");
            throw new RuntimeException("Error => book price must at lease 1$");
        }
        this.bookPrice = bookPrice;
    }


    // Constructor
    public Book(String bookName, int bookPrice, String bookAuthor, String bookPagesCount, String bookCategory) {
        //Local Variables
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.bookAuthor = bookAuthor;
        this.bookPagesCount = bookPagesCount;
        this.bookCategory = bookCategory;

        printBookData();
    }

    public Book(){

    }

    public Book(String bookName) {
        this.bookName = bookName;

        System.out.println(bookName);
    }

    void data(String bookName, int bookPrice, String bookAuthor, String bookPagesCount, String bookCategory) {
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
