package api;

public class MathEx2 {
    public static void main(String[] args) {

        // Math.random() : 1~3사이 임의 숫자 발생
        while (true) {
            int num1 = (int) (Math.random() * 3) + 1;
            int num2 = (int) (Math.random() * 3) + 1;
            int num3 = (int) (Math.random() * 3) + 1;
            System.out.println("(" + num1 + ", " + num2 + ", " + num3 + ")");
            if (num1 == num2 && num1 == num3) {
                break;
            }
        }
    }
}
