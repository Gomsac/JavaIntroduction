package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int input = 0;

        System.out.print("Enter a number(-1 to exit): ");
        while (true) {
            input = sc.nextInt();

            if (input == -1) {
                System.out.println("exit");
                break;
            }

            sum += input;
            count++;
        }
        double average = (double) sum / count;
        System.out.println("sum = " + sum);
        System.out.println("Average = " + average);
    }
}
