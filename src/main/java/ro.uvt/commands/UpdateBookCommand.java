package ro.uvt.commands;

import ro.uvt.models.Book;

public class UpdateBookCommand implements Command<Book> {
    private final CommandContext context;
    private final Long id;
    private final Book updatedBook;

    public UpdateBookCommand(CommandContext context, Long id, Book updatedBook) {
        this.context = context;
        this.id = id;
        this.updatedBook = updatedBook;
    }

    @Override
    public Book execute() {
        return context.getBooksRepository().findById(id).map(book -> {
            book.setTitle(updatedBook.getTitle());
            return context.getBooksRepository().save(book);
        }).orElse(null);
    }
}