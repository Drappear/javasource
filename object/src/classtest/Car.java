package classtest;

// 자바 - 객체지향언어
// main() 메소드를 가지는 클래스와 가지지 않는 클래스

// 클래스 : 객체를 정의해 놓은 것
// 클래스는 객체를 생성하는데 사용

// 객체 : 사물 또는 개념
public class Car {
    // 특징(속성) -> 필드(변수로 작성)
    // 제조사, 모델, 색상, 최대 속도...
    String company;
    String model;
    String color;
    int maxSpeed;

    // 기능(동작) -> 메소드
    void forward() {
        System.out.println("전진");
    }

    void backward() {
        System.out.println("후진");
    }

}
