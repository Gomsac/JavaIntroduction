package method.ex;

public class MethodEx2Ref {
    public static void main(String[] args) {
        String message = "Hello, world!";

        printMessage("Hello, world", 3);
        printMessage("JAVA", 5);
        printMessage("GOOD", 7);

    }

    public static void printMessage(String message, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(message);
        }
    }
}