package com.ohgiraffers.test.model.dto;

public class BookDTO {
    private int bNo;
    private int category;
    private String title;
    private String author;

    public BookDTO() {}
    public BookDTO(int bookNum, String bookTitle, int bookCategory, String bookAuthor){}

    public BookDTO(int bookNum, int category, String title, String author) {
        this.bNo = bookNum;
        this.category = category;
        this.title = title;
        this.author = author;
    }

    public int getbNo() {
        return bNo;
    }

    public void setbNo(int bNo) {
        this.bNo = bNo;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "bNo : " +  bNo +
                ", category : " + category +
                ", title : " + title  +
                ", author : " + author +
                '}';
    }
}