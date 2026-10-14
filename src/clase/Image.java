package clase;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

public class Image implements Element, Picture {
    private String url;
    private Dimension dim;
    private PictureContent content;

    public Image(String url) {
        this.url = url;
        this.dim = new Dimension(800, 600);
        this.content = new PictureContent();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void add(Element element) {
        // Frunză: nu poate conține alte elemente
    }

    @Override
    public void remove(Element element) {
        // Frunză: nu are ce elimina
    }

    @Override
    public Element get(int index) {
        return null;
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
    public PictureContent content() {
        return this.content;
    }

    @Override
    public void print() {
        System.out.println("Image with name: " + url);
    }
}