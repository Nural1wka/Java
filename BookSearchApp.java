package com.example.mycalculator;
import java.util.*;
class Book {
    private String name;
    private String code;
    private int pages;

    public Book() {
    }

    public Book(String name, String code, int pages) {
        this.name = name;
        this.code = code;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getBookData() {
        return "Name: " + name + ", Code: " + code + ", Pages: " + pages;
    }
}

class ScientificBook extends Book {
    private int price;
    private String publisher;

    public ScientificBook() {
    }

    public ScientificBook(String name, String code, int pages, int price, String publisher) {
        super(name, code, pages);
        this.price = price;
        this.publisher = publisher;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String getBookData() {
        return super.getBookData() + ", Price: " + price + ", Publisher: " + publisher;
    }
}

class LiteratureBook extends Book {
    private String author;
    private int publishedYear;

    public LiteratureBook() {
    }

    public LiteratureBook(String name, String code, int pages, String author, int publishedYear) {
        super(name, code, pages);
        this.author = author;
        this.publishedYear = publishedYear;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    @Override
    public String getBookData() {
        return super.getBookData() + ", Author: " + author + ", Published Year: " + publishedYear;
    }
}

class Library {
    private String name;
    private String city;
    private String country;
    private Book[] books = new Book[100];
    private int sizeOfBooks = 0;

    public Library() {
    }

    public Library(String name, String city, String country) {
        this.name = name;
        this.city = city;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void addBook(Book b) {
        if (sizeOfBooks < books.length) {
            books[sizeOfBooks] = b;
            sizeOfBooks++;
        }
    }

    public void printLibraryData() {
        System.out.println("Library Name: " + name);
        System.out.println("Location: " + city + ", " + country);
        System.out.println("Number of Books: " + sizeOfBooks);
        System.out.println("Books:");

        for (int i = 0; i < sizeOfBooks; i++) {
            System.out.println(books[i].getBookData());
        }
    }
    public List<Book> searchBookByName(String name) {
        List<Book> result = new ArrayList<>();
        for (int i = 0; i < sizeOfBooks; i++) {
            if (books[i].getName().equalsIgnoreCase(name)) {
                result.add(books[i]);
            }
        }
        return result;
    }

    public Book searchBookByCode(String code) {
        for (int i = 0; i < sizeOfBooks; i++) {
            if (books[i].getCode().equalsIgnoreCase(code)) {
                return books[i];
            }
        }
        return null;
    }

    public List<Book> searchBookByPagesAmount(int minPages, int maxPages) {
        List<Book> result = new ArrayList<>();
        for (int i = 0; i < sizeOfBooks; i++) {
            int pages = books[i].getPages();
            if (pages >= minPages && pages <= maxPages) {
                result.add(books[i]);
            }
        }
        return result;
    }
}

class Main {
    public static void main(String[] args) {
        Library library = new Library("Public Library", "New York", "USA");


        library.addBook(new ScientificBook("Physics: Principles and Applications", "SCI001", 600, 100, "Science Pub"));
        library.addBook(new ScientificBook("Chemistry Essentials", "SCI002", 450, 120, "Chemistry Co."));
        library.addBook(new ScientificBook("Biology Basics", "SCI003", 320, 80, "BioPublishers"));

        library.addBook(new LiteratureBook("Pride and Prejudice", "LIT001", 400, "Jane Austen", 1813));
        library.addBook(new LiteratureBook("To Kill a Mockingbird", "LIT002", 336, "Harper Lee", 1960));
        library.addBook(new LiteratureBook("The Great Gatsby", "LIT003", 218, "F. Scott Fitzgerald", 1925));

        library.printLibraryData();
    }
}
public class BookSearchApp {
    public static void main(String[] args) {
        Library library = new Library("Public Library", "New York", "USA");

        library.addBook(new ScientificBook("Physics: Principles and Applications", "SCI001", 600, 100, "Science Pub"));
        library.addBook(new ScientificBook("Chemistry Essentials", "SCI002", 450, 120, "Chemistry Co."));
        library.addBook(new ScientificBook("Biology Basics", "SCI003", 320, 80, "BioPublishers"));

        library.addBook(new LiteratureBook("Pride and Prejudice", "LIT001", 400, "Jane Austen", 1813));
        library.addBook(new LiteratureBook("To Kill a Mockingbird", "LIT002", 336, "Harper Lee", 1960));
        library.addBook(new LiteratureBook("The Great Gatsby", "LIT003", 218, "F. Scott Fitzgerald", 1925));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("PRESS [1] TO SEARCH BOOK BY NAME");
            System.out.println("PRESS [2] TO SEARCH BOOK BY CODE");
            System.out.println("PRESS [3] TO SEARCH BOOK BY PAGES AMOUNT");
            System.out.println("PRESS [4] TO EXIT");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("INSERT NAME OF THE BOOK:");
                    String bookName = scanner.nextLine();
                    List<Book> booksByName = library.searchBookByName(bookName);
                    printSearchResults(booksByName);
                    break;

                case 2:
                    System.out.println("INSERT CODE OF THE BOOK:");
                    String bookCode = scanner.nextLine();
                    Book bookByCode = library.searchBookByCode(bookCode);
                    printSearchResults(Collections.singletonList(bookByCode));
                    break;

                case 3:
                    System.out.println("INSERT MINIMUM AMOUNT OF PAGES:");
                    int minPages = scanner.nextInt();
                    System.out.println("INSERT MAXIMUM AMOUNT OF PAGES:");
                    int maxPages = scanner.nextInt();
                    List<Book> booksByPages = library.searchBookByPagesAmount(minPages, maxPages);
                    printSearchResults(booksByPages);
                    break;

                case 4:
                    System.out.println("Exiting the program...");
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void printSearchResults(List<Book> books) {
        if (books.isEmpty()) {
            System.out.println("No matching books found.");
        } else {
            System.out.println("Matching books:");
            for (Book book : books) {
                System.out.println(book.getBookData());
            }
        }
        System.out.println("------------------------------");
    }
}

