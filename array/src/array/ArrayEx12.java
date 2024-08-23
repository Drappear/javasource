package array;

import java.util.Scanner;

public class ArrayEx12 {
    public static void main(String[] args) {
        // 5명의 학생들의 점수를 입력받아 최고점수, 평균 출력
        // 학생수는 변경될 수 있으므로 동적으로 생성
        Scanner sc = new Scanner(System.in);

        int[] students;
        int sum = 0;
        int max = 0;

        // 학생 수 입력 받아 배열 생성
        System.out.print("학생 수를 입력하세요. >> ");
        int num = sc.nextInt();

        students = new int[num];

        // 점수 입력받기
        for (int i = 0; i < students.length; i++) {
            System.out.printf("%d번 학생의 점수를 입력해주세요. >> ", i + 1);
            students[i] = sc.nextInt();
        }

        // 최고점, 평균 구하기
        for (int i = 0; i < students.length; i++) {
            // 점수 평균 계산을 위해 점수 총합 구하기
            sum += students[i];
            // 최고점수 구하기
            if (max < students[i]) {
                max = students[i];
            }

        }

        System.out.printf("%d명 학생 중 최고점수는 %d, 평균 %d점 입니다.", students.length, max, sum / students.length);

        sc.close();
    }
}
