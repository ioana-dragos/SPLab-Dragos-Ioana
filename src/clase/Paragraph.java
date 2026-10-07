package clase;

public class Paragraph implements Element {
    private String text;
    private AlignStrategy textAlignment;

    public Paragraph(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setAlignStrategy(AlignStrategy textAlignment) {
        this.textAlignment = textAlignment;
    }

    @Override
    public void print() {
        if (textAlignment != null) {
            textAlignment.render(this);
        } else {
            System.out.println("Paragraph: " + text);
        }
    }
}