package ro.uvt.services;

import ro.uvt.models.Paragraph;

public interface AlignStrategy {
    void render(Paragraph paragraph);
}