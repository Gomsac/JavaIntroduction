package method;

public class Method1Return1 {

    public static void main(String[] args) {
        boolean result = add(1);
        System.out.println(result);
    }

    public static boolean add(int n) {
        if(n % 2 == 1) {
            return true;
        }
        return false;
    }
}
