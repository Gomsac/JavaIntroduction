package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.print("Enter a number(enter 0 to exit): ");
            int number = sc.nextInt();
            sum += number;

            if(number == 0){
                System.out.println("exit program");
                break;
            }
        }
        System.out.println("sum = " + sum);
    }
}
