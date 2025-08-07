import java.util.*;

public class UserInterface {
    public static void main(String[] args) {
        Processingarea library = new Processingarea();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Add Student");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. View Available Books");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter book ID: ");
                    String bookId = scanner.nextLine();
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter number of Books: ");
                    int count = scanner.nextInt();
                    library.addBooks(new Addbooksdata(bookId, title, author, count));
                    System.out.println("Book added successfully.");
                    break;
                case 2:
                    System.out.print("Enter student ID: ");
                    String studentId = scanner.nextLine();
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    library.addStudents(new Addstudentdata(studentId, name));
                    System.out.println("Student added successfully.");
                    break;
                case 3:
                    System.out.print("Enter book ID to issue: ");
                    String issueBookId = scanner.nextLine();
                    System.out.print("Enter student ID: ");
                    String issueStudentId = scanner.nextLine();
                    library.issueBooks(issueBookId, issueStudentId);
                    break;
                case 4:
                    System.out.print("Enter book ID to return: ");
                    String returnBookId = scanner.nextLine();
                    System.out.print("Enter student ID: ");
                    String returnStudentId = scanner.nextLine();
                    library.returnBooks(returnBookId, returnStudentId);
                    break;
                case 5:
                    if (library.books.isEmpty()) {
                        System.out.println("No books available.");
                    } else {
                        System.out.println("Available books:");
                        library.viewAvailableBooks();
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

    }
}
