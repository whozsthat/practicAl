import java.util.Scanner;

public class Main {

    static String[] students = new String[5];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Shto student");
            System.out.println("2. Shfaq studentët");
            System.out.println("3. Fshi student");
            System.out.println("4. Dil");
            System.out.print("Zgjidh: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // pastron bufferin

            if (choice == 1) {
                addStudent();
            } else if (choice == 2) {
                showStudents();
            } else if (choice == 3) {
                deleteStudent();
            } else if (choice == 4) {
                System.out.println("Duke dalë...");
                break;
            } else {
                System.out.println("Zgjedhje e gabuar!");
            }
        }
    }

    public static void addStudent() {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                System.out.print("Shkruaj emrin: ");
                students[i] = scanner.nextLine();
                System.out.println("Studenti u shtua!");
                return;
            }
        }
        System.out.println("Nuk ka vend!");
    }

    public static void showStudents() {
        System.out.println("\nLista:");
        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + ". " + students[i]);
        }
    }

    public static void deleteStudent() {
        System.out.print("Shkruaj index-in (1-5): ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();

        if (index >= 0 && index < students.length) {
            students[index] = null;
            System.out.println("Studenti u fshi!");
        } else {
            System.out.println("Index i gabuar!");
        }
    }
}
