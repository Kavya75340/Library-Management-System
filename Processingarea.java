import java.util.ArrayList;
import java.util.List;

public class Processingarea {
    List<Addbooksdata> books;
    private List<Addstudentdata> students;

    public Processingarea() {
        books = new ArrayList<>();
        students = new ArrayList<>();
    }

    public void addBooks(Addbooksdata book) {
        books.add(book);
    }

    public void addStudents(Addstudentdata student) {
        students.add(student);
    }

    public void issueBooks(String bookID, String studentId) {
        Addbooksdata book = findthebook(bookID);
        Addstudentdata student = findthestudent(studentId);
        if (book != null && book.isAvailable() && student != null) {
            student.issueTheBook(book);
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book issue failed.");
        }
    }

    public void returnBooks(String bookID, String studentId) {
        Addbooksdata book = findthebook(bookID);
        Addstudentdata student = findthestudent(studentId);
        if (book != null && student != null) {
            student.returnTheBook(book);
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book return failed.");
        }
    }

    public Addbooksdata findthebook(String Id) {
        for (Addbooksdata book : books) {
            if (book.getId().equals(Id)) {
                return book;
            }
        }
        return null;
    }

    public Addstudentdata findthestudent(String Id) {
        for (Addstudentdata student : students) {
            if (student.getId().equals(Id)) {
                return student;
            }
        }
        return null;
    }

    public void viewAvailableBooks() {
        for (Addbooksdata book : books) {
            if (book.isAvailable()) {
                System.out.println("ID: " + book.getId() + ", Title: " + book.getTitle() + ", Author: "
                        + book.getAuthor() + ", No of Books: " + book.getNoOfBook());
            }
        }
    }
}