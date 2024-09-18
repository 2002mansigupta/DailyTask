package anudipwatshapp;

import java.util.Scanner;

public class BitChecker {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Input the number and the bit position
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();

        System.out.print("Enter the bit position (n): ");
        int n = scanner.nextInt();

        // Validate the bit position
        if (n < 0 || n >= Integer.SIZE) {
            System.out.println("Invalid bit position.");
            scanner.close();
            return;
        }

        // Check if the nth bit is set
        boolean isBitSet = (num & (1 << n)) != 0;

        // Output the result
        System.out.println("The " + n + "th bit is " + (isBitSet ? "set (1)" : "not set (0)"));

        // Close the scanner
        scanner.close();
    }
}
