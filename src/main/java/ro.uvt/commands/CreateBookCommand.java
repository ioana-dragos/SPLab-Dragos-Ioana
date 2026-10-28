package ro.uvt.commands;

import ro.uvt.models.Book;

public class CreateBookCommand implements Command<Book> {
    private final CommandContext context;
    private final Book bookToSave;

    public CreateBookCommand(CommandContext context, Book bookToSave) {
        this.context = context;
        this.bookToSave = bookToSave;
    }

    @Override
    public Book execute() {
        return context.getBooksRepository().save(bookToSave);
    }
}