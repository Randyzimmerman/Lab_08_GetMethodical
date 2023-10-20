import java.util.Scanner;

public class FavNumbers {

    public static int getInt(Scanner pipe, String prompt) {
        int result = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print(prompt + ": ");

            if (pipe.hasNextInt()) {
                result = pipe.nextInt();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");

                pipe.nextLine();
            }
        }


        pipe.nextLine();

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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int favoriteInt = getInt(scanner, "Please enter your favorite integer");
        System.out.println("You entered your favorite integer: " + favoriteInt);

        double favoriteDouble = getDouble(scanner, "Please enter your favorite double");
        System.out.println("You entered your favorite double: " + favoriteDouble);

        scanner.close();
    }
}
