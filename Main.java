import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. Register User");
            System.out.println("3. Display Books");
            System.out.println("4. Display Users");
            System.out.println("5. Issue Book");
            System.out.println("6. Return Book");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();
                    library.addBook(new Book(id, title, author));
                    break;

                case 2:
                    System.out.print("Enter User ID: ");
                    String userId = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    library.addUser(new User(userId, name));
                    break;

                case 3:
                    library.displayBooks();
                    break;

                case 4:
                    library.displayUsers();
                    break;

                case 5:
                    System.out.print("Enter Book ID to issue: ");
                    String issueId = sc.nextLine();
                    library.issueBook(issueId);
                    break;

                case 6:
                    System.out.print("Enter Book ID to return: ");
                    String returnId = sc.nextLine();
                    library.returnBook(returnId);
                    break;

                case 0:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);

        sc.close();
    }
}
