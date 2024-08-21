package ch3;

import java.util.Scanner;

public class SwitchEx3 {
    public static void main(String[] args) {
        // 가위(1) 바위(2) 보(3) 게임

        // 컴퓨터가 내는 부분
        int comNum = (int) (Math.random() * 3) + 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("1 ~ 3의 숫자를 입력해주세요");
        System.out.println("가위 : 1, 바위 : 2, 보 : 3");

        int userNum = sc.nextInt();

        switch (userNum - comNum) {
            case 1:
            case -2:
                System.out.println("이겼습니다.");
                break;
            case 0:
                System.out.println("비겼습니다.");
                break;
            case 2:
            case -1:
                System.out.println("졌습니다.");
                break;
            default:
                System.out.println("잘못된 숫자입니다.");
                break;
        }

        sc.close();
    }
}
