package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요:");
        String str = sc.nextLine(); // 입력을 String으로 가져온다.
        System.out.println("입력한 문자열: " + str);

        System.out.print("정수를 입력하세요:");
        int intVal = sc.nextInt();
        System.out.println("입력한 정수: " + intVal);

        System.out.print("실수를 입력하세요:");
        double doubleVal = sc.nextDouble();
        System.out.println("입력한 실수: " + doubleVal);

    }
}
