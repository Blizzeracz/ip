package duke;

import duke.task.Task;

import java.util.Scanner;
public class Ui {
    private Scanner scanner;
    public Ui() {
        scanner = new Scanner(System.in);
    }
    public void showWelcomeMessage() {
        System.out.println("Hi! This is your AI assistant LoyBoy!");
        System.out.println("What can I do for you today?");
    }
    public String getUserInput() {
        System.out.print("\nEnter a command: ");
        return scanner.nextLine();
    }
    public void showTaskAddedMessage(Task task, int totalTasks) {
        System.out.println("Got it! I've added this task:");
        System.out.println("  " + task);
        System.out.println("Now you have " + totalTasks + " task(s) in the list.");
    }

    public void showTaskRemoveMessage(Task task, int totalTasks) {
        System.out.println("Yes Sir. I've removed the following task:");
        System.out.println("  " + task);
        System.out.println("Now you have " + totalTasks + " task(s) in the list.");
    }

    public void showNoMatchingTasksMessage() {
        System.out.println("No matching tasks found in your list :(");
    }
    public void showFindTaskMessage() {
        System.out.println("Here are the matching tasks in your list:)");
    }
    public void showGoodbyeMessage() {
        System.out.println("I wish you a pleasant day ahead, goodbye!");
    }
    public void showLoadingError() {
        System.err.println("Error! Cannot load tasks from data file.");
    }
    public void closeScanner() {
        scanner.close();
    }
}
