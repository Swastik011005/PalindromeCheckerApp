import java.util.Stack;
// UC5:Stack Based Palindrome Implementation

public class PC {

    public boolean checkPalindrome(String input) {

        if (input == null || input.trim().isEmpty()) {
            return false;
        }

        String processed = input.replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < processed.length(); i++) {
            stack.push(processed.charAt(i));
        }

        for (int i = 0; i < processed.length(); i++) {
            if (processed.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

