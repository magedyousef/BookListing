package com.example.maged.booklisting;

public class Book {

    private String mName;
    private String mAuthor;
    private String mUrl;

    public Book(String name, String author, String url) {
        mName = name;
        mAuthor = author;
        mUrl = url;
    }

    public String getName() {
        return mName;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public String getUrl() {
        return mUrl;
    }

}
