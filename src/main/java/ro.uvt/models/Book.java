package ro.uvt.models;

import jakarta.persistence.*;
import ro.uvt.services.Visitor;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Author> authors = new ArrayList<>();

    @OneToMany(targetEntity = BaseElement.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "book_id")
    private List<Element> content = new ArrayList<>();
    public Book() {
    }

    public Book(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    public void addContent(Element element) {
        this.content.add(element);
    }

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

    @JsonProperty("elements") // Cerința 8: redenumește proprietatea în JSON
    public List<Element> getContent() {
        return content;
    }

    public void setContent(List<Element> content) {
        this.content = content;
    }
}