import java.util.ArrayList;
import java.util.Scanner;

public class HowLarge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();

        System.out.println("Please enter strings, press enter with an empty string to stop.");

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            inputs.add(input);
        }
        System.out.println("The total amount of items in the list was: " + inputs.size());
        scanner.close();

    }
}
