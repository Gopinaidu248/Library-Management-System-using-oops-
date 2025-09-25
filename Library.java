import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    // Add a book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    // Register a user
    public void addUser(User user) {
        users.add(user);
        System.out.println("User registered successfully!");
    }

    // Display all books
    public void displayBooks() {
        System.out.println("\n--- Books in Library ---");
        for (Book b : books) {
            System.out.println(b);
        }
    }

    // Display all users
    public void displayUsers() {
        System.out.println("\n--- Registered Users ---");
        for (User u : users) {
            System.out.println(u);
        }
    }

    // Issue a book to a user
    public void issueBook(String bookId) {
        for (Book b : books) {
            if (b.getId().equals(bookId)) {
                if (!b.isIssued()) {
                    b.issue();
                    System.out.println("Book issued successfully!");
                } else {
                    System.out.println("Book is already issued!");
                }
                return;
            }
        }
        System.out.println("Book not found!");
    }

    // Return a book
    public void returnBook(String bookId) {
        for (Book b : books) {
            if (b.getId().equals(bookId)) {
                if (b.isIssued()) {
                    b.returnBook();
                    System.out.println("Book returned successfully!");
                } else {
                    System.out.println("This book was not issued!");
                }
                return;
            }
        }
        System.out.println("Book not found!");
    }
}
