package guru.springframework.spring5webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.domain.Publisher;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepository;
import guru.springframework.spring5webapp.repositories.PublisherRepository;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author brandon = new Author("Brandon", "Sanderson");
        Book twk = new Book("The Way of Kings", "9780765376671");
        brandon.getBooks().add(twk);
        twk.getAuthors().add(brandon);

        authorRepository.save(brandon);
        bookRepository.save(twk);

        Author darren = new Author("Darren", "Shan");
        Book cdf = new Book("Cirque Du Freak", "9780316042963");
        darren.getBooks().add(cdf);
        cdf.getAuthors().add(darren);

        authorRepository.save(darren);
        bookRepository.save(cdf);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books: " + bookRepository.count());

        Publisher penguin = new Publisher("Penguin", "Iceberg Street", "South Pole", "Antartica", "0000");
        publisherRepository.save(penguin);

        System.out.println("Number of Publishers: " + publisherRepository.count());
        System.out.print(penguin.toString());
    }

    
}
