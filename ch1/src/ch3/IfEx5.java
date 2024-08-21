package ch3;

import java.util.Scanner;

public class IfEx5 {
    public static void main(String[] args) {
        // 근무시간에 따른 임금 계산
        // 근무시간 입력받기
        // 8시간까지 : 시간당 기본 임금(10000)
        // 초과근무시간 : 시간당 기본임금의 1.5배

        int rate = 10000;
        int pay = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("근무시간을 입력해주세요. >> ");

        int hours = sc.nextInt();

        if (hours <= 8) {
            pay = rate * hours;
        } else {
            pay = (int) (rate * (hours - 8) * 1.5) + rate * 8;
        }

        System.out.printf("근무시간 : %d 임금 : %d\n", hours, pay);

        sc.close();
    }
}
