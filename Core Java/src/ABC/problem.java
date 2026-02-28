import java.util.Scanner;
import java.util.Stack;
import java.util.*;

public class googlestack {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack<String> backStack = new Stack<>();
        Stack<String> forwardStack = new Stack<>();

        String currentPage = "Google";
        System.out.println("Opened: " + currentPage);

        System.out.println("\nType page name to visit");
        System.out.println("Type '<' to go back");
        System.out.println("Type '>' to go forward");
        System.out.println("Type 'exit' to stop\n");

        while (true) {

            System.out.print("Enter: ");
            String input = sc.nextLine();

            if (input.equals("exit")) {
                System.out.println("Browser Closed.");
                break;
            }

            // Back
            else if (input.equals("<")) {
                if (!backStack.isEmpty()) {
                    forwardStack.push(currentPage);
                    currentPage = backStack.pop();
                    System.out.println("Went Back to: " + currentPage);
                } else {
                    System.out.println("No page to go back!");
                }
            }

            // Forward
            else if (input.equals(">")) {
                if (!forwardStack.isEmpty()) {
                    backStack.push(currentPage);
                    currentPage = forwardStack.pop();
                    System.out.println("Went Forward to: " + currentPage);
                } else {
                    System.out.println("No page to go forward!");
                }
            }

            // Visit new page
            else {
                backStack.push(currentPage);
                currentPage = input;
                forwardStack.clear();
                System.out.println("Opened: " + currentPage);
            }
        }

        sc.close();
    }
}
