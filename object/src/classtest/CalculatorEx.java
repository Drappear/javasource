package classtest;

public class CalculatorEx {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.powerOn();

        // return 존재 시 : 1) 변수에 담기, 2) 사용
        int result = calculator.plus(5, 10);
        System.out.println("연산 결과 : " + result);
        System.out.println("연산 결과 : " + calculator.plus(8, 9));

        double divResult = calculator.divide(9, 3);
        System.out.println("나눗셈 결과 : " + divResult);

        // System.out.println(calculator.powerOff()); -> X
        // void는 호출만 가능
        calculator.powerOff();

        Calculator2 calculator2 = new Calculator2();
        calculator2.execute();
    }
}
