package ro.uvt.models;

import jakarta.persistence.*;
import ro.uvt.services.Visitor;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class BaseElement implements Element {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public BaseElement() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Metodele cerute de interfața Element
    @Override
    public void print() {
    }

    @Override
    public void add(Element element) {
    }

    @Override
    public void remove(Element element) {
    }

    @Override
    public Element get(int index) {
        return null;
    }

    @Override
    public void accept(Visitor visitor) {
    }
}