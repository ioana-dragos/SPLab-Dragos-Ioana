package ro.uvt.services;

import ro.uvt.models.Book;
import ro.uvt.models.Section;
import ro.uvt.models.TableOfContents;
import ro.uvt.models.Paragraph;
import ro.uvt.models.ImageProxy;
import ro.uvt.models.Image;
import ro.uvt.models.Table;

public class GenerateToC implements Visitor {
    private TableOfContents toc = new TableOfContents();

    @Override
    public void visit(Book book) {
        // Dacă dorești, poți adăuga titlul cărții
    }

    @Override
    public void visit(Section section) {
        // Colectează titlul secțiunii în cuprins
        toc.addEntry(section.getTitle());
    }

    @Override
    public void visit(TableOfContents toc) {
    }

    @Override
    public void visit(Paragraph paragraph) {
    }

    @Override
    public void visit(ImageProxy imageProxy) {
    }

    @Override
    public void visit(Image image) {
    }

    @Override
    public void visit(Table table) {
    }

    public TableOfContents getToC() {
        return toc;
    }
}