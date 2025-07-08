package ru.pojo;

public class Book {
    private String title;
    private short page;

    public Book(String title, short page) {
        this.title = title;
        this.page = page;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public short getPage() {
        return page;
    }

    public void setPage(short page) {
        this.page = page;
    }
}
