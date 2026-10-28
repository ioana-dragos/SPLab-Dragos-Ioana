package ro.uvt.commands;

import ro.uvt.models.Book;
import java.util.Optional;

public class GetBookByIdCommand implements Command<Optional<Book>> {
    private final CommandContext context;
    private final Long id;

    public GetBookByIdCommand(CommandContext context, Long id) {
        this.context = context;
        this.id = id;
    }

    @Override
    public Optional<Book> execute() {
        return context.getBooksRepository().findById(id);
    }
}