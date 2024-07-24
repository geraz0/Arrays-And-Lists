import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        // ArrayList to store the integer inputs from the user
        ArrayList<Integer> numbers = new ArrayList<>();

        // Prompt the user for input
        System.out.println("Enter integers (enter 0 to finish):");

        // Infinite loop to continually accept inputs until 0 is entered
        while (true) {
            int input = scanner.nextInt(); // Read an integer input
            if (input == 0) { // Check if the input is 0, which signals the end of input
                break; // Exit the loop if 0 is entered
            }
            numbers.add(input); // Add the entered integer to the list if it's not 0
        }

        // Calculate the sum of the integers in the list
        int sum = calculateSum(numbers);

        // Output the list of integers entered
        System.out.print("The items in the list were: ");
        for (int i = 0; i < numbers.size(); i++) {
            // Print each number followed by a comma unless it's the last number
            System.out.print(numbers.get(i) + (i < numbers.size() - 1 ? ", " : ""));
        }
        System.out.println("."); // End the list with a period

        // Output the sum of the numbers in the list
        System.out.println("The sum of that list is: " + sum);

        // Close the scanner to free up resources
        scanner.close();
    }

    // Method to calculate the sum of a list of integers
    public static int calculateSum(ArrayList<Integer> numbers) {
        int sum = 0; // Initialize sum to 0
        for (int number : numbers) { // Iterate through each number in the list
            sum += number; // Add each number to the sum
        }
        return sum; // Return the calculated sum
    }
}
