package method;

public class MethodCastiong1 {

    public static void main(String[] args) {
        double number = 3.5;
//        printNumber(number);
        printNumber((int)number);
    }

    public static void printNumber(int number) {
        System.out.println("숫자: "+ number);
    }
}
