package cond.ex;

public class GradeSwitchEx {
    public static void main(String[] args) {
        String grade = "B";
        
        switch (grade) {
            case "A":
                System.out.println("좋아!");
                break;
            case "B":
                System.out.println("중간!");
                break;
            default:
                System.out.println("몰라");
                break;
        }
    }
}
