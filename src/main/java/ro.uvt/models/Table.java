package ro.uvt.models;

import jakarta.persistence.Entity;
import ro.uvt.services.Visitor;

@Entity
@jakarta.persistence.Table(name = "book_tables")
public class Table extends BaseElement {

    private String title;

    public Table() {
    }

    public Table(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Table with Title: " + title);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}