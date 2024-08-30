package api;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        // System.in : 키보드
        Scanner sc = new Scanner(System.in);

        String[] argArr = null;
        while (true) {
            String prompt = ">>";
            System.out.print(prompt);
            String input = sc.nextLine();

            // 양쪽 공백 제거
            input = input.trim();

            // 문자열 분리 : 공백 기준
            // "공백+" : 공백이 1 ~ 무한
            // regex : 정규식
            argArr = input.split(" +");

            // 소문자로 변경
            for (int i = 0; i < argArr.length; i++) {
                argArr[i] = argArr[i].toLowerCase();
            }

            // q or Q 면 while 종료
            if (input.equalsIgnoreCase("q")) {
                System.exit(0);
            } else {
                // q 가 아니면 배열 출력
                System.out.println(Arrays.toString(argArr));
            }
        }
    }
}
