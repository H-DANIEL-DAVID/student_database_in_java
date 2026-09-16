# Student Grade Management System (Java)

A lightweight, console-based Java application designed to manage student profiles, calculate assessment averages, and assign letter grades using Object-Oriented Programming (OOP) principles.

## Features

- **Add Student Records:** Capture student ID, name, and continuous assessment marks (CAT1 & CAT2).
- **Automated Grade Processing:** Automatically calculates average scores and assigns letter grades (`S`, `A`, `B`, `C`, `D`, `F`).
- **View All Records:** Displays formatted list of all stored student profiles.
- **Search Functionality:** Quickly find specific student details using their unique Student ID.
- **In-Memory Storage:** Efficient array-based dynamic memory storage using Java `ArrayList`.

---

## Core OOP Concepts Used

1. **Encapsulation:** Private attributes (`id`, `name`, `cat1Marks`, `cat2Marks`) accessed via getter methods.
2. **Modularity:** Separate computational methods (`calculateAverage()` and `getGrade()`) encapsulated within the `Student` model.
3. **Collections Framework:** Dynamic object management using `java.util.ArrayList`.

---

## How to Run

### Prerequisites
- Java Development Kit (JDK 8 or higher)

### Steps

1. **Clone the repository:**
   ```bash
   git clone [https://github.com/YOUR-USERNAME/YOUR-REPO-NAME.git](https://github.com/YOUR-USERNAME/YOUR-REPO-NAME.git)
   cd YOUR-REPO-NAME
2. **Compile the program**
```bash
   javac StudentSystem.java
```
3. **Run the program**
```bash
   java StudentSystem
```

