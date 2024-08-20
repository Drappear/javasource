package ch1;

public class VarByteEx1 {
    public static void main(String[] args) {
        // 프로그램에서 구현할 부분을 코드로 작성
        // 변경되는 부분은 변수로 작성
        // 변수는 선언 후 사용 : 타입 변수명 = 초기값;
        // 타입 : 정수형, 실수형, 문자형, 불린형
        // 1) 정수형 : byte(1 byte), short(2 byte), int(4 byte), long(8 byte)
        // 2) 실수형 : float(4 byte), double(8 byte)
        // 3) 문자형 : char(2 byte)
        // 4) 논리형 : boolean(1 byte)
        // 주 사용 타입은 int, double, char, boolean
        // 변수명 : 대소문자 구별, 예약어 사용 불가, 숫자로 시작 안됨, 특수문자는 _, $ 만 가능
        // 소문자 시작 : age, name, curPos(두 개의 단어가 혼합 된다면 뒤의 단어를 대문자로 시작)
        // 변수명을 보고 용도를 알게 해주는 것이 중요

        // 변수 선언 후 초기화
        int age = 25;
        String name = "홍길동";

        // 초기화된 값 변경
        age = 40;

        // print() : 화면 출력(엔터x)
        // println() : 화면 출력 후 엔터
        // printf() : 포맷을 적용한 출력(엔터x)(%d-정수형, %f-실수형, %c-문자형, %s-문자열형, %b-논리형)
        // \n == enter, \t == tab
        // System.out.printf("제 나이는 %d 이고, 이름은 %s 입니다. \n", age, name);
        // \출력시 정해진 형태가 있기 때문에 하나만 쓸 경우 오류
        // System.out.println("안녕\하세요"); -> 오류
        System.out.println("안녕\\하세요"); // \출력

        // 자바는 문자와 문자열이 다름
        // 문자 : 하나 -> 'a'
        // 문자열 : 여러개의 문자 -> "abc" or "a"
        System.out.print("제 나이는 " + age + " 이고, 이름은 " + name + " 입니다.");
        System.out.println("제 나이는 " + age + " 이고, 이름은 " + name + " 입니다.");
        System.out.printf("제 나이는 %d 이고, 이름은 %s 입니다.", age, name);
        System.out.println("안녕하세요");
    }
}
