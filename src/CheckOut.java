import java.util.Scanner;

public class CheckOut {

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double result = 0.0;
        boolean validInput = false;

        while (!validInput) {
            result = getDouble(pipe, prompt);
            if (result >= low && result <= high) {
                validInput = true;
            } else {
                System.out.println("Input out of range. Please enter a value between $" + low + " and $" + high + ".");
            }
        }

        return result;
    }

    public static double getDouble(Scanner pipe, String prompt) {
        double result = 0.0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print(prompt + ": ");

            if (pipe.hasNextDouble()) {
                result = pipe.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid double value.");

                pipe.nextLine();
            }
        }


        pipe.nextLine();

        return result;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        while (true) {
            System.out.print(prompt + " (Y/N): ");
            String input = pipe.nextLine().trim();
            if (input.equalsIgnoreCase("Y")) {
                return true;
            } else if (input.equalsIgnoreCase("N")) {
                return false;
            } else {
                System.out.println("Invalid input. Please enter 'Y' for Yes or 'N' for No.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalCost = 0.0;

        do {
            double itemPrice = getRangedDouble(scanner, "Please enter the price of the item ($0.50 - $10.00)", 0.5, 10.0);
            totalCost += itemPrice;

        } while (getYNConfirm(scanner, "Do you have more items to add?"));

        System.out.printf("Total cost of items: $%.2f%n", totalCost);
        scanner.close();
    }
}
