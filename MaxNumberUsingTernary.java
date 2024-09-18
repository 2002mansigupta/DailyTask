package anudipwatshapp;

import java.util.Scanner;

public class MaxNumberUsingTernary {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Find the maximum using the ternary operator
        int max = (num1 > num2) ? num1 : num2;

        // Output the maximum number
        System.out.println("The maximum number is: " + max);

        // Close the scanner
        scanner.close();
    }
}

