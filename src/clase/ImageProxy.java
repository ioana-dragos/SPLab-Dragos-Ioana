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
    public PictureContent content() {
        return loadImage().content();
    }

    @Override
    public void print() {
        loadImage().print();
    }
}