package ch3;

import java.util.Scanner;

public class IfEx3 {
    public static void main(String[] args) {
        // 점수를 입력받아 90이상이면 A, 98이상이면 A+, 94이상이면 A0, 94미만이면 A-
        // 80이상이면 B, 88이상이면 B+, 84이상이면 B0, 84미만이면 B-

        char grade = ' ';
        char opt = '0';

        Scanner sc = new Scanner(System.in);

        System.out.print("점수를 입력하세요. >>");
        int score = sc.nextInt();

        if (score >= 90) {
            grade = 'A';
            if (score >= 98) {
                opt = '+';
            } else if (score < 94) {
                opt = '-';
            }
        } else if (score >= 80) {
            grade = 'B';
            if (score >= 88) {
                opt = '+';
            } else if (score < 84) {
                opt = '-';
            }
        }

        System.out.printf("점수 : %d, 학점 : %c%c\n", score, grade, opt);
        sc.close();

    }
}
