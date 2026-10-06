public class Author {
    private String name;
    private String surname;

    // Constructor pentru apelul new Author("Radu Pavel Gheo")
    public Author(String fullName) {
        this.name = fullName;
    }

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void print() {
        System.out.println("Author: " + name + (surname != null ? " " + surname : ""));
    }
}