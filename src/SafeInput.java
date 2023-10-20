import java.util.Scanner;

public class SafeInput {

    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";
        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);

        return retString;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = getNonZeroLenString(scanner, "Please enter your name");
        System.out.println("Hello, " + name + "!");
        scanner.close();
    }
}
