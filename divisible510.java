import java.util.Scanner;

public class divisible510 {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        
        // Close the scanner to prevent memory leaks
        scanner.close();
        
        // Check if the number is divisible by both 5 and 10
        if (num % 5 == 0 && num % 10 == 0) {
            System.out.println(num + " is divisible by both 5 and 10.");
        } else {
            System.out.println(num + " is NOT divisible by both 5 and 10.");
        }
    }
}
