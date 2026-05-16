import java.util.*;

public class Main {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static void addStudent() {
        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Age: ");
        int age = sc.nextInt();

        students.add(new Student(id, name, age));
        System.out.println("Student added.");
    }

    static void viewStudents() {
    if (students.isEmpty()) {
        System.out.println("No records found");
        return;
    }

    for (Student s : students)
        System.out.println(s);
}

    static void searchStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        for (Student s : students) {
            if (s.id == id) {
                System.out.println(s);
                return;
            }
        }
        System.out.println("Not found");
    }

    static void deleteStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        students.removeIf(s -> s.id == id);
        System.out.println("Deleted");
    }

    static void updateStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Student s : students) {
            if (s.id == id) {
                System.out.print("New name: ");
                s.name = sc.nextLine();

                System.out.print("New age: ");
                s.age = sc.nextInt();

                System.out.println("Updated");
                return;
            }
        }
        System.out.println("Not found");
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1.Add 2.View 3.Search 4.Update 5.Delete 6.Exit");
            int ch = sc.nextInt();

            switch (ch) {
                case 1 -> addStudent();
                case 2 -> viewStudents();
                case 3 -> searchStudent();
                case 4 -> updateStudent();
                case 5 -> deleteStudent();
                case 6 -> System.exit(0);
            }
        }
    }
}