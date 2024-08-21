package ch2;

public class OperEx1 {
    public static void main(String[] args) {
        // 연산자(operator)
        // 1) 산술 연산자 : +, -, *, /, %
        // 2) 비교 연산자 : >, <, >=, <=, ==, !=
        // 3) 논리 연산자 : &&, ||, !
        // 4) 대입 연산자 : =

        // 연산자 우선순위
        // 산술 > 비교 > 논리 > 대입 순으로 수행됨

        // 두 개의 정수형 변수를 선언한 후 사칙 연산 프로그램 작성

        int num1 = 10;
        int num2 = 20;

        System.out.printf("%d + %d = %d\n", num1, num2, (num1 + num2));
        System.out.printf("%d - %d = %d\n", num1, num2, (num1 - num2));
        System.out.printf("%d * %d = %d\n", num1, num2, (num1 * num2));

        // 자바에서 나누기는 몫만 출력
        System.out.printf("%d / %d = %d\n", num1, num2, (num1 / num2));
        // System.out.printf("%d / %d = %f\n", num1, num2, (num1 / num2));
        // % : 나머지 출력
        System.out.printf("%d %% %d = %d\n", num1, num2, (num1 % num2));

        System.out.println();

        float result = num1 + num2;
        System.out.printf("%d + %d = %f\n", num1, num2, result);
        result = num1 - num2;
        System.out.printf("%d - %d = %f\n", num1, num2, result);
        result = num1 * num2;
        System.out.printf("%d * %d = %f\n", num1, num2, result);
        result = num1 / num2;
        System.out.printf("%d / %d = %f\n", num1, num2, result);
        result = num1 / (float) num2;
        System.out.printf("%d / %d = %f\n", num1, num2, result);

        char ch1 = 'A' + 1;
        System.out.println("ch1 = " + ch1);
    }
}
