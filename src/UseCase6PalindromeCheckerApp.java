//UC6: Queue + Stack Fairness Check

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class UseCase6PalindromeCheckerApp {

    /**
     * Application entry point for UC6.
     */
    public static void main(String[] args) {

        String input = "madam";

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Insert characters into both stack and queue
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
            queue.add(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare elements
        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.remove())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }
    }
}