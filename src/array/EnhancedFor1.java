package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        // 일반 for 문
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }

        // 강화 for문 : for-each 문 but index값이 필요한경우는 쓰지 못함
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
