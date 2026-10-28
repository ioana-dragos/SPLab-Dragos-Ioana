

public class Main {
//    public static void main(String[] args) throws Exception {
//        // --- 1. Test Structură Carte / Composite ---
//        Book noapteBuna = new Book("Noapte buna, copii!");
//        Author rpGheo = new Author("Radu Pavel Gheo");
//        noapteBuna.addAuthor(rpGheo);
//
//        Section cap1 = new Section("Capitolul 1");
//        Section cap11 = new Section("Capitolul 1.1");
//        Section cap111 = new Section("Capitolul 1.1.1");
//        Section cap1111 = new Section("Subchapter 1.1.1.1");
//
//        noapteBuna.addContent(new Paragraph("Multumesc celor care ..."));
//        noapteBuna.addContent(cap1);
//
//        cap1.add(new Paragraph("Moto capitol"));
//        cap1.add(cap11);
//        cap11.add(new Paragraph("Text from subchapter 1.1"));
//        cap11.add(cap111);
//        cap1111.add(new Image("Image subchapter 1.1.1.1"));
//        cap111.add(cap1111);
//        cap1111.add(new Image("place.models.Image subchapter 1.1.1.1"));
//
//        noapteBuna.print();
//
//        // --- 2. Test Strategy Pattern ---
//        Section capStrategy = new Section("Capitolul Strategy");
//        Paragraph p1 = new Paragraph("Paragraph 1");
//        capStrategy.add(p1);
//        Paragraph p2 = new Paragraph("Paragraph 2");
//        capStrategy.add(p2);
//        Paragraph p3 = new Paragraph("Paragraph 3");
//        capStrategy.add(p3);
//        Paragraph p4 = new Paragraph("Paragraph 4");
//        capStrategy.add(p4);
//
//        System.out.println("\nPrinting without Alignment\n");
//        capStrategy.print();
//
//        p1.setAlignStrategy(new AlignCenter());
//        p2.setAlignStrategy(new AlignRight());
//        p3.setAlignStrategy(new AlignLeft());
//
//        System.out.println("\nPrinting with Alignment\n");
//        capStrategy.print();
//
//        // --- 3. Test Proxy Pattern ---
//        long startTime = System.currentTimeMillis();
//        ImageProxy img1 = new ImageProxy("Pamant_1.jpg");
//        ImageProxy img2 = new ImageProxy("Pamant_2.jpg");
//        long endTime = System.currentTimeMillis();
//        System.out.println("\nTimp creare proxy-uri: " + (endTime - startTime) + " ms");
//
//        startTime = System.currentTimeMillis();
//        img1.print();
//        endTime = System.currentTimeMillis();
//        System.out.println("Timp prima randare: " + (endTime - startTime) + " ms");
//
//        startTime = System.currentTimeMillis();
//        img1.print();
//        endTime = System.currentTimeMillis();
//        System.out.println("Timp a doua randare: " + (endTime - startTime) + " ms\n");
//
//        // --- 4. Test Visitor Pattern (BookStatistics) ---
//        Section capVisitor = new Section("Capitolul 1 - Visitor");
//        Paragraph vp1 = new Paragraph("Paragraph 1");
//        capVisitor.add(vp1);
//        Paragraph vp2 = new Paragraph("Paragraph 2");
//        capVisitor.add(vp2);
//        Paragraph vp3 = new Paragraph("Paragraph 3");
//        capVisitor.add(vp3);
//        Paragraph vp4 = new Paragraph("Paragraph 4");
//        capVisitor.add(vp4);
//        capVisitor.add(new ImageProxy("ImageOne"));
//        capVisitor.add(new Image("ImageTwo"));
//        capVisitor.add(new Paragraph("Some text"));
//        capVisitor.add(new Table("Table 1"));
//
//        BookStatistics stats = new BookStatistics();
//        capVisitor.accept(stats);
//        stats.printStatistics();
//
//        // --- 5. Test Generate Table of Content (GenerateToC) ---
//        GenerateToC tocVisitor = new GenerateToC();
//        noapteBuna.accept(tocVisitor);
//        TableOfContents toc = tocVisitor.getToC();
//        toc.print();
//    }
}