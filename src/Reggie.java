import java.util.Scanner;

public class Reggie {

    public static String getRegExString(Scanner pipe, String prompt, String regexPattern) {
        String result = null;
        boolean validInput = false;

        while (!validInput) {
            System.out.print(prompt + ": ");
            result = pipe.nextLine();

            if (result.matches(regexPattern)) {
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid value matching the pattern: " + regexPattern);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ssnPattern = "^\\d{3}-\\d{2}-\\d{4}$";
        String ssn = getRegExString(scanner, "Please enter an SSN (e.g., 123-45-6789)", ssnPattern);
        System.out.println("Valid SSN: " + ssn);

        String mNumberPattern = "^(M|m)\\d{5}$";
        String mNumber = getRegExString(scanner, "Please enter a UC Student M number (e.g., M12345)", mNumberPattern);
        System.out.println("Valid M number: " + mNumber);

        String menuChoicePattern = "^[OoSsVvQq]$";
        String menuChoice = getRegExString(scanner, "Please enter a menu choice (O: Open, S: Save, V: View, Q: Quit)", menuChoicePattern);
        System.out.println("Valid menu choice: " + menuChoice);

        scanner.close();
    }
}
