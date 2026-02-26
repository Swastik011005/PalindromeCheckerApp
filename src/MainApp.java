import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PC checker = new PC();

        System.out.println("=================================");
        System.out.println(" PALINDROME CHECKER APP ");
        System.out.println("=================================");

        while (true) {

            System.out.print("\nEnter a string to check (or type 'exit' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for using the app!");
                break;
            }

            boolean result = checker.checkPalindrome(input);

            if (result) {
                System.out.println("Result: It is a Palindrome.");
            } else {
                System.out.println("Result: It is NOT a Palindrome.");
            }
        }

        scanner.close();
    }
}

