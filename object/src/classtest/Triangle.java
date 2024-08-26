package classtest;

public class Triangle {
    // 속성
    // 밑변(baseLine)
    // 높이(height)
    private int baseLine;
    private int height;

    public Triangle(int baseLine, int height) {
        this.baseLine = baseLine;
        this.height = height;
    }

    // 기능
    // 삼각형 너비 리턴
    double getArea() {
        return baseLine * height / 2.0;
    }

    // 밑변 변화
    public void setBaseLine(int baseLine) {
        this.baseLine = baseLine;
    }

    // 높이 변화
    public void setHeight(int height) {
        this.height = height;
    }
}
