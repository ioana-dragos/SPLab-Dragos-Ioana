import clase.*;

public class Main {
    public static void main(String[] args) {
        Book noapteBuna = new Book("Noapte buna, copii!");
        Author rpGheo = new Author("Radu Pavel Gheo");
        noapteBuna.addAuthor(rpGheo);

        Section cap1 = new Section("Capitolul 1");
        Section cap11 = new Section("Capitolul 1.1");
        Section cap111 = new Section("Capitolul 1.1.1");
        Section cap1111 = new Section("Subchapter 1.1.1.1");

        noapteBuna.addContent(new Paragraph("Multumesc celor care ..."));
        noapteBuna.addContent(cap1);

        cap1.add(new Paragraph("Moto capitol"));
        cap1.add(cap11);
        cap11.add(new Paragraph("Text from subchapter 1.1"));
        cap11.add(cap111);
        cap1111.add(new Image("Image subchapter 1.1.1.1"));
        cap111.add(cap1111);
        cap1111.add(new Image("clase.Image subchapter 1.1.1.1"));

        noapteBuna.print();
        Section capStrategy = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        capStrategy.add(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        capStrategy.add(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        capStrategy.add(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        capStrategy.add(p4);

        System.out.println("Printing without Alignment\n");
        capStrategy.print();

        p1.setAlignStrategy(new AlignCenter());
        p2.setAlignStrategy(new AlignRight());
        p3.setAlignStrategy(new AlignLeft());

        System.out.println("\nPrinting with Alignment\n");
        capStrategy.print();
    }
}