package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        // 배열은 한번 생성하면 길이 변경 불가

        // 학생 10명의 점수 배열 생성
        int score[] = { 88, 78, 90, 55, 85, 98, 45, 20, 60, 72 };

        // 5명의 점수가 추가되야 한다면
        // 15명의 점수를 담을 저장공간 생성
        int score2[] = new int[15];
        // 기존 10명의 점수를 복사
        for (int i = 0; i < score.length; i++) {
            score2[i] = score[i];
        }

        for (int i = 0; i < score2.length; i++) {
            System.out.printf("%d  ", score2[i]);
        }
        System.out.println();

        // 5명의 점수를 입력 받은 후 배열 요소 채우기
        Scanner sc = new Scanner(System.in);

        for (int i = 10; i < 15; i++) {
            System.out.printf("%d 번 학생 점수입력 >> ", i + 1);
            score2[i] = sc.nextInt();
        }

        // 확인
        System.out.println(Arrays.toString(score2));

        sc.close();

    }
}
