package extendstest;

public class Child extends Parent {

    String name;

    void play() {
        System.out.println("놀기");
    }

    @Override
    void print() {
        super.print(); // 가려지는 부모의 메소드 호출
        System.out.println("자식 메소드");
    }
}
