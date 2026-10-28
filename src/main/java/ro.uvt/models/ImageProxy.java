package ro.uvt.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Transient;
import ro.uvt.services.Visitor;

@Entity
public class ImageProxy extends BaseElement {

    private String url;

    @Transient
    private Image realImage;

    public ImageProxy() {
    }

    public ImageProxy(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @JsonIgnore
    public Image getRealImage() {
        return loadImage();
    }

    public Image loadImage() {
        if (realImage == null) {
            realImage = new Image(url);
        }
        return realImage;
    }

    @Override
    public void print() {
        loadImage().print();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}