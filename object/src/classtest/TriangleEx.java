package classtest;

public class TriangleEx {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5, 7);

        System.out.println("삼각형 넓이 : " + triangle.getArea());

        // 밑변, 높이 변경
        triangle.setBaseLine(15);
        System.out.println("삼각형 넓이 : " + triangle.getArea());

        triangle.setHeight(10);
        System.out.println("삼각형 넓이 : " + triangle.getArea());

    }
}
