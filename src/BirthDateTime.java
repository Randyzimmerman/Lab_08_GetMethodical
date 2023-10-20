import java.util.Scanner;

public class BirthDateTime {

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int result = 0;
        boolean validInput = false;

        while (!validInput) {
            result = getInt(pipe, prompt);
            if (result >= low && result <= high) {
                validInput = true;
            } else {
                System.out.println("Input out of range. Please enter a value within the specified range.");
            }
        }

        return result;
    }

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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int birthYear = getRangedInt(scanner, "Please enter the birth year (1950-2015)", 1950, 2015);
        int birthMonth = getRangedInt(scanner, "Please enter the birth month (1-12)", 1, 12);

        int maxDaysInMonth;
        switch (birthMonth) {
            case 4: case 6: case 9: case 11:
                maxDaysInMonth = 30;
                break;
            case 2:
                maxDaysInMonth = 29;
                break;
            default:
                maxDaysInMonth = 31;
        }

        int birthDay = getRangedInt(scanner, "Please enter the birth day (1-" + maxDaysInMonth + ")", 1, maxDaysInMonth);
        int birthHours = getRangedInt(scanner, "Please enter the birth hours (1-24)", 1, 24);
        int birthMinutes = getRangedInt(scanner, "Please enter the birth minutes (1-59)", 1, 59);

        System.out.println("You entered: " + birthYear + "-" + birthMonth + "-" + birthDay + " " + birthHours + ":" + birthMinutes);
        scanner.close();
    }
}
