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

        scanner.close();
    }

    private static void viewTodos() {
        System.out.println("\nYour To-Do List:");
        if (todos.isEmpty()) {
            System.out.println("Your to-do list is empty.");
        } else {
            for (int i = 0; i < todos.size(); i++) {
                System.out.println((i + 1) + ". " + todos.get(i));
            }
        }
    }

    private static void addTodo(Scanner scanner) {
        System.out.print("\nEnter the task to add: ");
        String task = scanner.nextLine();
        todos.add(task);
        System.out.println("Task added to your to-do list.");
    }

    private static void removeTodo(Scanner scanner) {
        if (todos.isEmpty()) {
            System.out.println("\nYour to-do list is empty.");
            return;
        }
        
        viewTodos();
        System.out.print("Enter the number of the task to remove: ");
        
        int index = scanner.nextInt() - 1;
        scanner.nextLine();  // consume the newline character

        if (index >= 0 && index < todos.size()) {
            todos.remove(index);
            System.out.println("Task removed from your to-do list.");
        } else {
            System.out.println("Invalid task number. Please try again.");
        }
    }
}
