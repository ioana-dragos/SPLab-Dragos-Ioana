package clase;

public class Paragraph implements Element {
    private String text;
    private AlignStrategy textAlignment;

    public Paragraph(String text) {
        this.text = text;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void add(Element element) {
        // Frunză: nu conține alți copii
    }

    @Override
    public void remove(Element element) {
        // Frunză: nu are ce elimina
    }

    @Override
    public Element get(int index) {
        return null;
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