package classtest;

public class Student {
    // 속성(학번, 이름, 주소, 전화번호..)
    private String studentNum;
    private String name;
    private String address;
    private String phone;

    // 생성자를 명시하지 않는다면 컴파일러가 default 생성자를 자동으로 생성
    // 생성자의 목적 : 인스턴스 초기화

    // 생성자 오버로딩
    public Student(String studentNum) {
        this.studentNum = studentNum;
    }

    public Student(String studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }

    public Student(String studentNum, String name, String address) {
        this.studentNum = studentNum;
        this.name = name;
        this.address = address;
    }

    public Student(String studentNum, String name, String address, String phone) {
        this.studentNum = studentNum;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public Student() {
    }

    // 메소드
    // 특정 작업을 수행하는 일련의 문장들을 하나로 묶은 것
    // 재사용성, 중복된 코드 제거, 프로그램 구조 구조화

    // 리턴타입 메소드명(){}
    // 정수형, 실수형, 논리형, 문자, 배열, void

    public String getStudentNum() {
        return studentNum;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

}
