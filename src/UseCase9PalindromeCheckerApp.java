//UC9: Recursive Palindrome Checker

public class UseCase9PalindromeCheckerApp {
    public static void main(String[] args) {

        String input = "madam";

        boolean result = check(input, 0, input.length() - 1);

        if (result) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }
    }

    private static boolean check(String s, int start, int end) {

        // Base case: All characters checked
        if (start >= end) {
            return true;
        }

        // If mismatch found
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call for inner substring
        return check(s, start + 1, end - 1);
    }
}