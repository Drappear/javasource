package ch4;

public class ForEx9 {
    public static void main(String[] args) {
        // 1~100 사이의 숫자 중에서 소수 출력
        // 소수 : 1과 자기 자신만으로 나누어 떨어지는 수
        int count = 0;
        for (int i = 2; i < 101; i++) {
            for (int j = 1; j <= i; j++) {
                // i를 j로 나눈 나머지가 0인지 확인 후 숫자 세기
                if (i % j == 0) {
                    count++;
                }
            }
            // 숫자가 2 라면 소수 -> 출력
            if (count == 2) {
                System.out.print(i + " ");
            }
            count = 0;
        }
    }
}
