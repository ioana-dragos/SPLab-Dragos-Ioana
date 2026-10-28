package ro.uvt.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BooksService {

    private final List<String> books = new ArrayList<>();

    public BooksService() {
        // Date dummy inițiale
        books.add("Carte 1: Design Patterns");
        books.add("Carte 2: Clean Code");
    }

    public List<String> getAllBooks() {
        return new ArrayList<>(books);
    }

    public String getBookById(Long id) {
        int index = id.intValue();
        if (index >= 0 && index < books.size()) {
            return books.get(index);
        }
        return "Book with ID " + id + " not found";
    }

    public String createBook(String bookTitle) {
        books.add(bookTitle);
        return "Book created: " + bookTitle;
    }

    public String updateBook(Long id, String newTitle) {
        int index = id.intValue();
        if (index >= 0 && index < books.size()) {
            books.set(index, newTitle);
            return "Book updated to: " + newTitle;
        }
        return "Cannot update: Book not found";
    }

    public String deleteBook(Long id) {
        int index = id.intValue();
        if (index >= 0 && index < books.size()) {
            return "Book deleted: " + books.remove(index);
        }
        return "Cannot delete: Book not found";
    }
}