package ch4;

public class ForEx1 {
    public static void main(String[] args) {
        // 반복문
        // for, while, do-while
        // 안녕하세요 10번 출력

        for (int i = 0; i < 10; i++) {
            System.out.println("안녕하세요");
        }

        // 1) int i = 0; 실행
        // 2) i < 10; 조건 검사
        // 3) for 블럭 안 구문 실행
        // 4) i++ 실행 i = 1
        // 5) i < 10; 조건 검사
        // 6) for 블럭 안 구문 실행
        // 4~6 반복 실행
        // i = 10 된 후 조건 검사 false가 되면 반복문 종료

        for (int i = 1; i < 10; i++) {
            System.out.print(i + "\t");
        }

        System.out.println();

        for (int i = 2; i < 11; i += 2) {
            System.out.print(i + "\t");
        }

        System.out.println();

        for (int i = 1; i < 11; i += 2) {
            System.out.print(i + "\t");
        }

        System.out.println();

        for (int i = 10; i > 0; i--) {
            System.out.print(i + "\t");
        }
    }
}
