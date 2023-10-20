public class PrettyHeader {
    public static void prettyHeader(String msg) {
        int width = 60;
        int msgLength = msg.length();

        if (msgLength > width - 6) {

            msg = msg.substring(0, width - 9) + "...";
            msgLength = msg.length();
        }

        int padding = (width - msgLength - 6) / 2;

        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("***");
        for (int i = 0; i < padding; i++) {
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int i = 0; i < padding; i++) {
            System.out.print(" ");
        }
        if (msgLength % 2 != 0) {

            System.out.print(" ");
        }
        System.out.println("***");

        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        prettyHeader("Message Centered Here");
    }
}
