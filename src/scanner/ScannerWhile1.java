package scanner;

import java.util.Scanner;

public class ScannerWhile1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 숫자, 두번쨰 숫자 0을 입력하면 프로그램을 종료합니다.");
        while (true){
            System.out.print("첫 번쨰 숫자를 입력하세요:");
            int a = sc.nextInt();

            System.out.print("두 번쨰 숫자를 입력하세요:");
            int b = sc.nextInt();
            if(a == 0 && b == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            int sum = a + b;
            System.out.println("두 수의 합은 : " + sum);
        }
    }
}
