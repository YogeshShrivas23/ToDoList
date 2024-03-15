import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    private static ArrayList<String> toDoList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {
            System.out.println("To-Do List Menu:");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. View List");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addItem(scanner);
                    break;
                case 2:
                    removeItem(scanner);
                    break;
                case 3:
                    viewList();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 4.");
            }
        }
    }

    private static void addItem(Scanner scanner) {
        System.out.print("Enter the item to add: ");
        String item = scanner.nextLine();
        toDoList.add(item);
        System.out.println("Item added successfully.");
    }

    private static void removeItem(Scanner scanner) {
        System.out.print("Enter the index of the item to remove: ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        if (index >= 0 && index < toDoList.size()) {
            String removedItem = toDoList.remove(index);
            System.out.println("Item \"" + removedItem + "\" removed successfully.");
        } else {
            System.out.println("Invalid index!");
        }
    }

    private static void viewList() {
        if (toDoList.isEmpty()) {
            System.out.println("The to-do list is empty.");
        } else {
            System.out.println("To-Do List:");
            for (int i = 0; i < toDoList.size(); i++) {
                System.out.println((i + 1) + ". " + toDoList.get(i));
            }
        }
    }
}
