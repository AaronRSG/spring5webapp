package guru.springframework.spring5webapp.domain;

import java.util.Set;

public class Author {
    private String firstName;
    private String lastName;
    private Set<Book> books;

    public Author(String firstname, String lastName, Set<Book> books){
        this.firstName = firstname;
        this.lastName = lastName;
        this.books = books;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Book> getBooks() {
        return this.books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    
}
