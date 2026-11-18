package ro.uvt.services;

import ro.uvt.models.Book;

public interface Observer {
    void update(Book book);
}