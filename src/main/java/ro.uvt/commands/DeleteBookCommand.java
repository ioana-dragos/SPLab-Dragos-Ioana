package ro.uvt.commands;

public class DeleteBookCommand implements Command<Void> {
    private final CommandContext context;
    private final Long id;

    public DeleteBookCommand(CommandContext context, Long id) {
        this.context = context;
        this.id = id;
    }

    @Override
    public Void execute() {
        context.getBooksRepository().deleteById(id);
        return null;
    }
}