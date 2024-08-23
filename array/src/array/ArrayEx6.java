package array;

public class ArrayEx6 {
    public static void main(String[] args) {
        int[] scores = { 50, 95, 78, 82, 64, 92, 100 };

        // 배열 요소 중 가장 큰 값과 가장 작은 값 구하기
        int max = scores[0];
        int min = scores[0];

        // for (int i = 0; i < scores.length; i++) {
        // if (max < scores[i]) {
        // max = scores[i];
        // }
        // if (min > scores[i]) {
        // min = scores[i];
        // }
        // }

        for (int score : scores) {
            if (max < score) {
                max = score;
            }
            if (min > score) {
                min = score;
            }
        }

        System.out.printf("가장 큰 값 : %d, 가장 작은 값 : %d\n", max, min);
    }
}
