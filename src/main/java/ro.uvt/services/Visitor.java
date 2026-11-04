
package ro.uvt.services;

import ro.uvt.models.Book;
import ro.uvt.models.Section;
import ro.uvt.models.TableOfContents;
import ro.uvt.models.Paragraph;
import ro.uvt.models.ImageProxy;
import ro.uvt.models.Image;
import ro.uvt.models.Table;

public interface Visitor {
    void visit(Book book);
    void visit(Section section);
    void visit(TableOfContents toc);
    void visit(Paragraph paragraph);
    void visit(ImageProxy imageProxy);
    void visit(Image image);
    void visit(Table table);
}
