package ch4;

import java.util.Scanner;

public class DoWhileEx1 {
    public static void main(String[] args) {
        // for, while과 다른 점은 {}를 수행한 후 조건식 검사
        // 따라서 최소 1번은 실행된다

        // do {

        // } while (조건식);

        // 1 ~ 100 사이의 임의의 숫자를 추출한 후 해당 숫자 맞추기
        Scanner sc = new Scanner(System.in);

        // 임의의 숫자 추출
        int answer = (int) (Math.random() * 100) + 1;
        int input = 0;
        do {
            System.out.print("1~100 사이의 숫자를 입력하세요. >> ");
            input = sc.nextInt();

            if (answer < input) {
                System.out.println("더 작은 수 입니다.");
            } else if (answer > input) {
                System.out.println("더 큰 수 입니다.");
            }
        } while (answer != input);
        System.out.println("정답입니다.");
        sc.close();
    }
}
