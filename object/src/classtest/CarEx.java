package classtest;

public class CarEx {
    public static void main(String[] args) {
        // 객체 생성
        Car car = new Car();

        // car 멤버 변수, 메소드에 접근 가능해짐
        printCar(car);

        // 속성 변경 가능
        car.company = "현대";
        car.color = "white";
        car.maxSpeed = 200;
        car.model = "소나타";

        printCar(car);

        car.forward();
        car.backward();

        Car cars[] = new Car[2];
        System.out.println(cars[0]);
        // NullPointerException : 객체에 값이 할당되지 않았을 때
        // System.out.println(cars[0].color);

        // String
        // String str = ""; / String str = null
        String str = ""; // 빈 문자열
        System.out.println(str.length());

        // NullPointerException
        // String str = null;
        // System.out.println(str.length());
    }

    static void printCar(Car car) {
        System.out.println("제조사 : " + car.company);
        System.out.println("모델 : " + car.model);
        System.out.println("색상 : " + car.color);
        System.out.println("최대속력 : " + car.maxSpeed);
    }
}
