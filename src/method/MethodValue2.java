package method;

public class MethodValue2 {

    public static void main(String[] args) {
        int nubmer = 5;
        System.out.println("1. changeNumber 호출 전, num1: " + nubmer);
        changeNumber(nubmer);
        System.out.println("4. changeNumber 호출 후, num1 = " + nubmer);

    }

    public static void changeNumber(int number) {
        System.out.println("2. changeNumber 변경 전, number: " + number);
        number = number * 2;
        System.out.println("3. changeNumber 변경 후, number: " + number);
    }
}
