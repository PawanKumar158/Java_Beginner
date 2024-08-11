import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    private static ArrayList<String> todos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nTodo List Menu:");
            System.out.println("1. View To-Do List");
            System.out.println("2. Add To-Do Item");
            System.out.println("3. Remove To-Do Item");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume the newline character

            switch (choice) {
                case 1:
                    viewTodos();
                    break;
                case 2:
                    addTodo(scanner);
                    break;
                case 3:
                    removeTodo(scanner);
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
}
