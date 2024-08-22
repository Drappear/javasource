package array;

public class ArrayEx2 {
    public static void main(String[] args) {
        // 10명의 수학 점수를 관리
        // 배열 선언, 생성(배열 요소의 값이 정해져 있는 경우)

        int score[] = { 88, 78, 90, 55, 85, 98, 45, 20, 60, 72 };

        // 수학 점수 출력
        // System.out.println("학생 1번의 수학 점수 : " + score[0]);
        // System.out.println("학생 2번의 수학 점수 : " + score[1]);
        // System.out.println("학생 3번의 수학 점수 : " + score[2]);
        // System.out.println("학생 4번의 수학 점수 : " + score[3]);
        // System.out.println("학생 5번의 수학 점수 : " + score[4]);
        // System.out.println("학생 6번의 수학 점수 : " + score[5]);
        // System.out.println("학생 7번의 수학 점수 : " + score[6]);
        // System.out.println("학생 8번의 수학 점수 : " + score[7]);
        // System.out.println("학생 9번의 수학 점수 : " + score[8]);
        // System.out.println("학생 10번의 수학 점수 : " + score[9]);

        int sum = 0;

        for (int i = 0; i < score.length; i++) {
            System.out.printf("학생 %d번의 수학 점수 : %d\n", (i + 1), score[i]);
            // 합계
            sum += score[i];
        }

        // 10명 점수 합계와 평균 출력
        System.out.printf("점수 합계 : %d , 점수 평균 : %d", sum, sum / score.length);
    }
}
