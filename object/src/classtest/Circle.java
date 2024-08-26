package classtest;

// 클래스 내에 선언 순서는 상관 없으나
// 주로 속성, 생성자, 메소드 순으로 선언
public class Circle {
    // 속성
    // 반지름(radius)

    // 기능
    // 원의 넓이 : 반지름*반지름*3.14
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double getCircleArea() {
        return radius * radius * 3.14;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
