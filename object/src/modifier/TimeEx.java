package modifier;

// java.lang패키지는 import구문이 필요없으나
import static java.lang.Math.*; //  Math

public class TimeEx {
    public static void main(String[] args) {
        // The constructor Time() is not visible
        // 생성자를 private 선언 해놓았기 때문
        // Time time = new Time();

        Time time1 = new Time();
        Time time2 = new Time();
        System.out.println(time1 == time2); // false

        // 싱글톤 패턴(개발 방식중 하나)
        // SinglTon singleTon = new SingleTon();
        // 인스턴스를 하나만 생성
        SingleTon singleTon1 = SingleTon.getInstance();
        SingleTon singleTon2 = SingleTon.getInstance();
        System.out.println(singleTon1 == singleTon2); // true

        // java.lang.Math
        // java.lang 패키지는 기본 import상태이므로 import구문이 필요없다
        // Math : 생성자는 private, 멤버 변수와 메소드가 static
        System.out.println(Math.random());
        System.out.println(Math.PI);

        // static import 후
        System.out.println(PI);
        System.out.println(random());
        System.out.println(round(1.5));

        Card card = new Card("Heart", 10);

        System.out.println("number " + card.NUMBER);
        // NUBMER, KIND 변경
        // The final field Card.NUMBER cannot be assigned // 불가
        // card.NUMBER = 15;
    }
}
