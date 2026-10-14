package clase;

import java.awt.Dimension;

public class ImageProxy implements Element, Picture {
    private String url;
    private Dimension dim;
    private Image realImage;

    public ImageProxy(String url) {
        this.url = url;
        this.dim = new Dimension(800, 600);
    }

    public Image loadImage() {
        if (realImage == null) {
            realImage = new Image(url);
        }
        return realImage;
    }

    @Override
    public String url() {
        return this.url;
    }

    @Override
    public Dimension dim() {
        return this.dim;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public PictureContent content() {
        return loadImage().content();
    }

    @Override
    public void print() {
        loadImage().print();
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
}