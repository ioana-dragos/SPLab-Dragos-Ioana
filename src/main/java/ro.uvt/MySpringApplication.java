package ro.uvt;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.uvt.models.Author;
import ro.uvt.models.Book;
import ro.uvt.models.Paragraph;
import ro.uvt.models.Section;
import ro.uvt.persistence.BooksRepository;

@SpringBootApplication
public class MySpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySpringApplication.class, args);
    }

    @Bean
    public CommandLineRunner initData(BooksRepository booksRepository) {
        return args -> {
            Book b = new Book("Design Patterns");
            Author a = new Author("Erich", "Gamma");
            b.addAuthor(a);

            Section cap1 = new Section("Capitolul 1");
            Paragraph p1 = new Paragraph("Moto: Primul paragraf");
            cap1.add(p1);

            b.addContent(cap1);

            // Salvează cartea (datorită CascadeType.ALL, se salvează automat autorul, secțiunea și paragraful)
            booksRepository.save(b);
        };
    }
}