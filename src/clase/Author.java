package clase;

public class Author {
    private String name;
    private String surname;

    // Constructor pentru apelul new clase.Author("Radu Pavel Gheo")
    public Author(String fullName) {
        this.name = fullName;
    }

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void print() {
        System.out.println("clase.Author: " + name + (surname != null ? " " + surname : ""));
    }
}