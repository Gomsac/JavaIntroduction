package method;

public class Method1Ref {

    public static void main(String[] args) {

        int sum = add(10, 20);
        System.out.println("sum = " + sum);

        System.out.println("======================");

        int sum2 = add(2, 3);
        System.out.println("sum2 = " + sum2);
    }

    public static int add(int a, int b) {
        System.out.println(a + "+" + b + " 연산 수행합니다!!");

        return a + b;
    }
}
