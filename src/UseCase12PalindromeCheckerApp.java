//UC12: Strategy Pattern for Palindrome Algorithms

public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        // Inject strategy at runtime
        PalindromeStrategy strategy = new StackStrategy();

        boolean result = strategy.check(input);

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}

interface PalindromeStrategy {

    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push all characters to stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters while popping
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}