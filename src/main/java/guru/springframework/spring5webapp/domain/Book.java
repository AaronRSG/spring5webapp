package guru.springframework.spring5webapp.domain;

import java.util.Set;

public class Book {
    private String title;
    private String isbn;
    private Set<Author> authors;

    public Book(){
    }

    public Book(String title, String isbn, Set<Author> authors){
        this.title = title;
        this.isbn = isbn;
        this.authors = authors;
    }
    public Set<Author> getAuthors() {
        return this.authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

}
