package ro.uvt.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import ro.uvt.services.Visitor;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.JoinColumn;
@Entity
public class Section extends BaseElement {

    private String title;

    @OneToMany(targetEntity = BaseElement.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "parent_section_id")
    private List<Element> children = new ArrayList<>();

    public Section() {
    }

    public Section(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Element> getChildren() {
        return children;
    }

    public void setChildren(List<Element> children) {
        this.children = children;
    }

    @Override
    public void add(Element element) {
        children.add(element);
    }

    @Override
    public void remove(Element element) {
        children.remove(element);
    }

    @Override
    public Element get(int index) {
        return children.get(index);
    }

    @Override
    public void print() {
        System.out.println(title);
        for (Element child : children) {
            child.print();
        }
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Element child : children) {
            child.accept(visitor);
        }
    }
}