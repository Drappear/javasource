package array;

import java.util.Arrays;

public class ArrayEx7 {
    public static void main(String[] args) {
        // 정수 10개를 배열 생성
        // 배열 요소 섞기

        int[] numArr = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = i;
        }

        System.out.println(Arrays.toString(numArr));

        // 100번 루프 돌리기
        for (int i = 0; i < 100; i++) {
            // 0~9 임의 숫자 추출
            int num = (int) (Math.random() * 10);
            int tmp = numArr[0];
            numArr[0] = numArr[num];
            numArr[num] = tmp;
        }
        System.out.println(Arrays.toString(numArr));
    }
}
