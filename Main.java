import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. List Students");
            System.out.println("4. Search Student");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Course: ");
                    String course = scanner.nextLine();
                    Student s = new Student(id, name, age, course);
                    manager.addStudent(s);
                    break;
                case 2:
                    System.out.print("Enter ID to remove: ");
                    int removeId = scanner.nextInt();
                    manager.removeStudent(removeId);
                    break;
                case 3:
                    manager.listStudents();
                    break;
                case 4:
                    System.out.print("Enter ID to search: ");
                    int searchId = scanner.nextInt();
                    Student found = manager.searchStudent(searchId);
                    if (found != null) {
                        System.out.println("Found: " + found);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
