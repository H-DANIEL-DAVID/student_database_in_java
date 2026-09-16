import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String id;
    private String name;
    private double cat1Marks;
    private double cat2Marks;

    public Student(String id, String name, double cat1Marks, double cat2Marks) {
        this.id = id;
        this.name = name;
        this.cat1Marks = cat1Marks;
        this.cat2Marks = cat2Marks;
    }

    public String getId() { return id; }

    public double calculateAverage() {
        return (cat1Marks + cat2Marks) / 2.0;
    }

    public String getGrade() {
        double avg = calculateAverage();
        if (avg >= 90) return "S";
        if (avg >= 80) return "A";
        if (avg >= 70) return "B";
        if (avg >= 60) return "C";
        if (avg >= 50) return "D";
        return "F";
    }

    public void displayStudent() {
        System.out.println("ID: " + id + " | Name: " + name + 
                           " | CAT1: " + cat1Marks + " | CAT2: " + cat2Marks + 
                           " | Avg: " + calculateAverage() + " | Grade: " + getGrade());
    }
}

public class StudentSystem {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- STUDENT GRADE SYSTEM ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            if (choice == 1) {
                System.out.print("Enter ID: ");
                String id = scanner.nextLine();

                System.out.print("Enter Name: ");
                String name = scanner.nextLine();

                System.out.print("Enter CAT1 Marks: ");
                double cat1 = scanner.nextDouble();

                System.out.print("Enter CAT2 Marks: ");
                double cat2 = scanner.nextDouble();

                students.add(new Student(id, name, cat1, cat2));
                System.out.println("Student added!");

            } else if (choice == 2) {
                if (students.isEmpty()) {
                    System.out.println("No records found.");
                } else {
                    System.out.println("\n--- ALL RECORDS ---");
                    for (Student s : students) {
                        s.displayStudent();
                    }
                }

            } else if (choice == 3) {
                System.out.print("Enter ID to search: ");
                String searchId = scanner.nextLine();
                boolean found = false;

                for (Student s : students) {
                    if (s.getId().equalsIgnoreCase(searchId)) {
                        s.displayStudent();
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Student not found.");
                }

            } else if (choice == 4) {
                System.out.println("Exiting application...");
                break;

            } else {
                System.out.println("Invalid choice!");
            }
        }
        scanner.close();
    }
}
