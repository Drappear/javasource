package ch1;

public class VarLongEx1 {
    public static void main(String[] args) {
        // L, l : 대소문자 둘 다 가능(보통 대문자), 생략 가능(붙이는것이 확실)
        long value = 123456789L;
        System.out.println(value);

        value = 10000000000L; // L 생략 하면 오류

        // print() 메소드 안의 + 의 의미는 연결 : ""와 같이 있을 때
        System.out.println("value = " + value);

        // 산술 연산
        System.out.println(value + value);
    }
}
