package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력 받을 숫자의 개수를 입력하세요");
        int count = sc.nextInt();
        int[] numbers = new int[count];
        int sum = 0;
        double  average;

        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < count; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }

        System.out.println("Sum: " + sum);
        System.out.println("average: " + (double)sum / count);
    }
}
