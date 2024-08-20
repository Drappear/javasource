package ch1;

public class VarFloatEx1 {
    public static void main(String[] args) {
        // 타입 변수명 = 초기화값;
        // F or f 가능, 실수는 기본 타입이 double이기 때문에 float임을 인지시켜줘야 함
        float score = 90.15F;

        // D or d 가능, 생략 가능
        double score2 = 75D;

        System.out.println("score = " + score);
        System.out.println("score2 = " + score2); // 75.0

        // 큰 타입 = 작은 타입(o)
        // double(8 byte) > int(4 byte)
        int value1 = 92;
        double score3 = value1;
        System.out.println("score3 = " + score3);

        // 작은 타입 = 큰 타입(x) -> 처리할 수 있으나 값의 손실이 일어날 수 있다.
        // int value2 = score2; x

    }
}
