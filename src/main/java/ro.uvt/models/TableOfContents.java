package ro.uvt.models;

import ro.uvt.services.Visitor;

import java.util.ArrayList;
import java.util.List;

public class TableOfContents implements Element {
    private List<String> entries = new ArrayList<>();

    public void addEntry(String entry) {
        entries.add(entry);
    }

    @Override
    public void print() {
        System.out.println("Table of Contents:");
        for (String entry : entries) {
            System.out.println(entry);
        }
    }

    @Override
    public void add(Element element) {
    }

    @Override
    public void remove(Element element) {
    }

    @Override
    public Element get(int index) {
        return null;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}