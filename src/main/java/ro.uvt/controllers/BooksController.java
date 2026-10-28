package ro.uvt.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.uvt.commands.CommandContext;
import ro.uvt.commands.GetAllBooksCommand;
import ro.uvt.commands.GetBookByIdCommand;
import ro.uvt.commands.CreateBookCommand;
import ro.uvt.commands.UpdateBookCommand;
import ro.uvt.commands.DeleteBookCommand;
import ro.uvt.models.Book;
import ro.uvt.persistence.CrudRepository;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {

    private final CrudRepository<Book, Long> booksRepository;

    public BooksController(CrudRepository<Book, Long> booksRepository) {
        this.booksRepository = booksRepository;
    }

    private CommandContext getContext() {
        return new CommandContext(booksRepository);
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return new GetAllBooksCommand(getContext()).execute();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        return new GetBookByIdCommand(getContext(), id).execute()
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        Book savedBook = new CreateBookCommand(getContext(), book).execute();
        return new ResponseEntity<>(savedBook, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book book) {
        Book updated = new UpdateBookCommand(getContext(), id, book).execute();
        if (updated != null) {
            return ResponseEntity.ok(updated);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        new DeleteBookCommand(getContext(), id).execute();
        return ResponseEntity.noContent().build();
    }
}