package classtest;

public class Calculator {
    void powerOn() {
        System.out.println("전원 켜짐");
    }

    int plus(int x, int y) {
        return x + y;
    }

    int subtract(int x, int y) {
        return x - y;
    }

    int multiply(int x, int y) {
        return x * y;
    }

    double divide(int x, int y) {
        // return int => double 자동 형 변환
        return (double) x / y;
    }

    void powerOff() {
        System.out.println("전원 꺼짐");
    }
}
