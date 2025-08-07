# 📚 Library Management System (Java OOP)

A simple console-based Library Management System built using **core Java and Object-Oriented Programming (OOP)** — no database, no frameworks, just pure logic and clean structure.

---

## 🧾 Project Structure

```
Library-Managment-System/
├── Addbooksdata.java        // Handles book-related logic
├── Addstudentdata.java      // Manages student/member data
├── Processingarea.java      // Main business logic (issue, return, etc.)
├── Userinterface.java       // Command-line interaction layer
└── README.md
```

---

## ✨ Features

-   📘 Add and list books
-   👥 Register and list students
-   🔄 Issue and return books
-   📂 In-memory data storage using Java collections
-   🧠 Clean use of Object-Oriented concepts

---

## 🔧 Technologies Used

-   Java (JDK 8+)
-   Java Collections (`ArrayList`, `HashMap`, etc.)
-   CLI (Command Line Interface)
-   Any IDE (VS Code, IntelliJ, Eclipse) or terminal

---

## 🚀 How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/Anurag20075/LibraryManagmentSystem.git
cd Library-Managment-System
```

### 2. Compile the Program

```bash
javac *.java
```

### 3. Run the Program

```bash
java Userinterface
```

> **Note:** Make sure the `Userinterface` class contains your `main` method.

---

## 🧠 Object-Oriented Design

This project is a great example of:

-   **Encapsulation:** Logical grouping of related data and methods in classes.
-   **Abstraction:** Users interact only with relevant options.
-   **Modularity:** Separated classes for book, student, and logic handling.
-   **Scalability:** Easy to add features like search, sorting, or file storage.

---

## 📌 Sample Menu

```
==== Library Management System ====

1. Add Book
2. List Books
3. Add Member
4. Issue Book
5. Return Book
6. Exit

Enter Your Choice:
```

---

## 🔮 Future Enhancements

-   Add file I/O or serialization to store data between runs
-   Implement search and filter options
-   GUI version using JavaFX or Swing
-   Role-based access (Admin, Student)
-   Export reports to file

---

## 📄 License

This project is licensed under the MIT License — free to use and modify.

---

## 👨‍💻 Author

Built with ☕ by [Anurag](https://github.com/Anurag20075)
