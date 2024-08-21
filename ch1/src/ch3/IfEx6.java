package ch3;

import java.util.*;

public class IfEx6 {
    public static void main(String[] args) {
        // 윤년/평년 구하기

        // 윤년 : 2012, 2016, 2020...
        // 년도를 4로 나눈 나머지가 0이고,
        // 년도를 100으로 나눈 나머지가 0이 아니거나
        // 년도를 400 으로 나눈 나머지가 0인 경우

        // 현재년도가 윤년인지 평년인지 출력

        Scanner sc = new Scanner(System.in);

        System.out.print("현재년도를 입력해주세요. >> ");
        int year = sc.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("윤년입니다.");
        } else {
            System.out.println("평년입니다.");
        }

        sc.close();
    }
}
