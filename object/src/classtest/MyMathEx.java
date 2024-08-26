package classtest;

public class MyMathEx {
    public static void main(String[] args) {
        MyMath myMath = new MyMath();

        // 메소드 호출 후 결과 출력
        long addResult = myMath.add(5L, 5L);
        long subResult = myMath.subtract(10L, 2L);
        long multiResult = myMath.multiply(3L, 5L);
        double divResult = myMath.divide(9L, 3L);

        System.out.println("더하기 결과 : " + addResult);
        System.out.println("빼기 결과 : " + subResult);
        System.out.println("곱하기 결과 : " + multiResult);
        System.out.println("나누기 결과 : " + divResult);

        System.out.println(myMath.max(8, 10));

        // 오버로딩
        int overResult = myMath.divide(10, 0);
        System.out.println("오버로딩 나누기 결과 : " + overResult);

        MyMath2 math2 = new MyMath2(15, 5);

        // 인스턴스 메소드 사칙 연산
        System.out.println("15 + 5 = " + math2.add());
        System.out.println("15 - 5 = " + math2.subtract());
        System.out.println("15 * 5 = " + math2.multiply());
        System.out.println("15 / 5 = " + math2.divide());

        // 클래스 메소드 사칙 연산
        System.out.println("15 + 5 = " + MyMath2.add(15, 5));
        System.out.println("15 - 5 = " + MyMath2.subtract(15, 5));
        System.out.println("15 * 5 = " + MyMath2.multiply(15, 5));
        System.out.println("15 / 5 = " + MyMath2.divide(15, 5));

    }
}
