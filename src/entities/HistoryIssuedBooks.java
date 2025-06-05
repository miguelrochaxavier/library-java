package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Books {
    public String name;
    public String author;
    public String isbn;

    public Books(String name, String author, String isbn) {
        this.name = name;
        this.author = author;
        this.isbn = isbn;
    }
}

public class HistoryIssuedBooks {
    public String name;
    public String author;
    public String isbn;

    public List<Books> books = new ArrayList<>();

    public HistoryIssuedBooks() {
        books.add(new Books("To Kill a Mockingbird", "Harper Lee", "978-0061120084"));
        books.add(new Books("1984", "George Orwell", "978-0451524935"));
        books.add(new Books("Pride and Prejudice", "Jane Austen", "978-1503290563"));
        books.add(new Books("Dom Casmurro", "Machado de Assis", "978-8535910660"));
        books.add(new Books("O Alquimista", "Paulo Coelho", "978-8575427583"));
        books.add(new Books("Grande Sertão: Veredas", "João Guimarães Rosa", "978-8535914842"));
        books.add(new Books("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565"));
        books.add(new Books("Brave New World", "Aldous Huxley", "978-0060850524"));
        books.add(new Books("Memórias Póstumas de Brás Cubas", "Machado de Assis", "978-8582850264"));
        books.add(new Books("Ensaio sobre a Cegueira", "José Saramago", "978-8535914842"));
    }

    public static HistoryIssuedBooks start() {
        HistoryIssuedBooks historyIssuedBooks = new HistoryIssuedBooks();
        System.out.println("List All issued Books:");
        for (Books book : historyIssuedBooks.books) {
            System.out.println("- " + book.name + " by " + book.author + " (ISBN: " + book.isbn + ")");
        }
        return historyIssuedBooks;
    }
}
