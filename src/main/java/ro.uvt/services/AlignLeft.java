package ro.uvt.services;

import ro.uvt.models.Paragraph;

public class AlignLeft implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph) {
        System.out.println(paragraph.getText());
    }
}