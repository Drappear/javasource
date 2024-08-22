package ch4;

public class ForEx4 {
    public static void main(String[] args) {
        // 중첩 for
        // for문 안에 또 다른 for문 포함(for문 중첩 횟수에 제한은 없음)

        for (int i = 0; i < 3; i++) {
            for (int j = 1; j < 11; j++) {
                // 열에서 반복되는 코드
                System.out.print("*");
            }
            System.out.println("*");
        }

        System.out.println();

        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }

        System.out.println();

        // for 동작 단계
        // 1) int i = 0; 실행
        // 2) i < 2; 실행
        // 3) for 내부 진입
        // 4) int j = 0;
        // 5) j < 2;
        // 6) 안쪽 for 구문 실행
        // 7) j++; 후 j < 2; true라면 다시 안쪽 for 구문 실행
        // 8) j = 2 가 되면서 false 상태일 때 안쪽 for문 종료
        // 9) i++; 후 i < 2; true라면 다시 안쪽 for 구문 실행
        // 10) 4~8 반복
        // 11) i = 2가 되면 이중 for문 종료
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

            }
        }
    }
}
