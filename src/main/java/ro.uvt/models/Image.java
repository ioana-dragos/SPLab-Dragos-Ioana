package ro.uvt.models;

import jakarta.persistence.Entity;
import ro.uvt.services.Visitor;

@Entity
public class Image extends BaseElement {

    private String url;

    public Image() {
    }

    public Image(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public void print() {
        System.out.println("Image with name: " + url);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}