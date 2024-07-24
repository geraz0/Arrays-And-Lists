import java.util.ArrayList;
import java.util.Scanner;

public class FifthItem {
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

        if (inputs.size() >= 5) {
            System.out.println("The fifth item in the list is: " + inputs.get(4));
        } else {
            System.out.println("There were not enough items to reach the fifth one.");
        }

        scanner.close();
    }
}
