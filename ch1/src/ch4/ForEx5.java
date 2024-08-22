package ch4;

public class ForEx5 {
    public static void main(String[] args) {
        // 구구단 2~9단 출력
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d x %d = %2d\t", i, j, i * j);
            }
            System.out.println();
        }
    }
}
