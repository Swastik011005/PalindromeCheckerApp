//UC13: Performance Benchmarking for Palindrome
public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        // Capture start time (nanoseconds)
        long startTime = System.nanoTime();

        // Palindrome logic (Two-pointer approach)
        boolean isPalindrome = true;
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        // Capture end time
        long endTime = System.nanoTime();

        long executionTime = endTime - startTime;

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + executionTime + " ns");
    }
}