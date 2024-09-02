package exception;

public class ExceptionEx1 {
    public static void main(String[] args) {
        int number = 100;
        int result = 0;

        for (int i = 0; i < 10; i++) {
            try {
                result = number / (int) (Math.random() * 10);
                System.out.println(result);
                int num = Integer.parseInt("abc");
                System.out.println(num);
            } catch (ArithmeticException | NumberFormatException e) {
                // Exception으로 전체 catch하거나 개별 Exception 설정
                // System.out.println("0으로 나눠짐");
                // e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }
    }
}
