public class UseCase4PalindromeCheckerApp {
    public static void main(String[] args) {

        String input = "madam";
        char[] characters = input.toCharArray();

        int left = 0;
        int right = characters.length - 1;

        boolean isPalindrome = true;

        while (left < right) {
            if (characters[left] != characters[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }
    }
}
