import java.util.Scanner;

public class sumodd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number (N): ");
        int n = scanner.nextInt();
        
        int sum = 0;
        
        // Loop from 1 to N and add odd numbers to the sum
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        
        System.out.println("The sum of odd numbers from 1 to " + n + " is: " + sum);
        
        scanner.close();
    }
}