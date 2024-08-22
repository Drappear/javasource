package ch4;

import java.util.Scanner;

public class ForEx7 {
    public static void main(String[] args) {
        // 5! 출력
        // 5*4*3*2*1
        // int result = 1;
        // for (int i = 5; i > 0; i--) {
        // result *= i;
        // }

        // 특정 숫자의 factorial 구하기
        Scanner sc = new Scanner(System.in);

        // 숫자 입력 받기
        System.out.print("factorial 구할 숫자 입력 >> ");
        int num = sc.nextInt();

        // 입력받은 숫자의 factorial 구한 후 출력
        int result = 1;
        for (int i = num; i > 0; i--) {
            result *= i;
        }
        System.out.printf("%d! = %d\n", num, result);

        sc.close();
    }
}
