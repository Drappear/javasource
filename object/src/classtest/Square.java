package classtest;

public class Square {
    // 직사각형 넓이, 정사각형의 넓이
    // 메소드 오버로딩
    double areaRectangle(double w, double h) {
        return w * h;
    }

    double areaRectangle(double w) {
        return w * w;
    }
}
