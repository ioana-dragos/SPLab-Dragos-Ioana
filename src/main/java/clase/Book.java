package clase;

import java.util.ArrayList;
import java.util.List;

public class Book implements Element {
    private String title;
    private List<Author> authors = new ArrayList<>();
    private List<Element> content = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void addContent(Element element) {
        content.add(element);
    }

    @Override
    public void add(Element element) {
        content.add(element);
    }

    @Override
    public void remove(Element element) {
        content.remove(element);
    }

    @Override
    public Element get(int index) {
        return content.get(index);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Element elem : content) {
            elem.accept(visitor);
        }
    }

    @Override
    public void print() {
        System.out.println("Book: " + title);
        System.out.println("\nAuthors:");
        for (Author author : authors) {
            author.print();
        }
        System.out.println();
        for (Element element : content) {
            element.print();
        }
    }
}