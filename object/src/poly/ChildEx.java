package poly;

public class ChildEx {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        // 상속관계일 때
        // 부모타입 = 자식타입
        Parent parent2 = new Child();

        // child, parent2 변수가 접근할 수 있는 범위가 다름

        // child 접근 가능한 메소드, 변수
        System.out.println(child.age + ", " + child.name);
        child.play();
        child.print();

        // parent2 접근 가능한 메소드, 변수
        System.out.println(parent2.age);
        parent2.print();

    }
}
