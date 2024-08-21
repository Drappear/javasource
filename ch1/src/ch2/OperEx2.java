package ch2;

public class OperEx2 {
    public static void main(String[] args) {
        // 단항 연산자
        // 1) 부호 연산자 : -, + (음수, 양수)
        // 2) 증감 연산자 : --, ++ (증감)
        // 증감 연산자가 앞쪽에 오는 경우 연산 먼저 실행 후 대입
        // 증감 연산자가 뒤쪽에 오는 경우 대입이 먼저 되고 연산
        // 단, 독립적인 하나의 문장으로 사용되는 경우에는 전위나 후위나 동일한 결과
        // 3) 논리 부정 연산자 : ! (true, false 와 함께 사용)

        int x = 10;
        // x++; // x = x + 1;
        // --x;
        // System.out.println("x = " + x);
        // System.out.println("x = " + (++x));
        System.out.println("x = " + (x++));

        // x--; // x = x - 1;
        // --x;
        // System.out.println("x = " + x);
        // System.out.println("x = " + (--x));
        System.out.println("x = " + (x--));

        boolean play = true;
        System.out.println(!play);

    }
}
