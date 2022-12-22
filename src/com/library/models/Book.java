package com.library.models;

public class BookModel {
    private int id ;
    private String title ;
    private int year ;
    private String author;
    private String isbm;
    private String category;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbm() {
        return isbm;
    }

    public void setIsbm(String isbm) {
        this.isbm = isbm;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public BookModel(int id, String title, int year, String author, String category, String isbm) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.author = author;
        this.isbm = isbm;
        this.category = category;
    }

}
