package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
    private static ArrayList<Task> tasks = new ArrayList<>();
    private static int nextTaskId = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("===== Task Manager CLI =====");

        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Task");
            System.out.println("2. Mark Task as Completed");
            System.out.println("3. List All Tasks");
            System.out.println("4. Exit");

            System.out.print("Your choice: ");
            String choice = scanner.nextLine();

            try {
                switch (choice) {
                    case "1":
                        addTask(scanner);
                        break;
                    case "2":
                        markTaskComplete(scanner);
                        break;
                    case "3":
                        listTasks();
                        break;
                    case "4":
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } catch (InvalidTaskException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Something went wrong: " + e.getMessage());
            } finally {
                System.out.println("----------");
            }
        }

        scanner.close();
        System.out.println("Exiting Task Manager.");
    }

    private static void addTask(Scanner scanner) throws InvalidTaskException {
        System.out.print("Enter task name: ");
        String name = scanner.nextLine();

        System.out.print("Enter due date (YYYY-MM-DD): ");
        String dateStr = scanner.nextLine();
        LocalDate dueDate = LocalDate.parse(dateStr);

        if (dueDate.isBefore(LocalDate.now())) {
            throw new InvalidTaskException("Due date cannot be in the past.");
        }

        Task task = new Task(nextTaskId++, name, dueDate);
        tasks.add(task);
        System.out.println("Task added successfully.");
    }

    private static void markTaskComplete(Scanner scanner) {
        System.out.print("Enter task ID to mark complete: ");
        int id = Integer.parseInt(scanner.nextLine());

        for (Task task : tasks) {
            if (task.getTaskId() == id) {
                task.markComplete();
                System.out.println("Task marked as completed.");
                return;
            }
        }
        System.out.println("Task not found.");
    }

    private static void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }

        for (Task task : tasks) {
            System.out.println(task);
        }
    }
}