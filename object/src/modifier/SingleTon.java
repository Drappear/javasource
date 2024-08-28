package modifier;

public class SingleTon {

    // 자기 자신의 인스턴스 형성
    private static SingleTon singleTon = new SingleTon();

    private SingleTon() {

    }

    public static SingleTon getInstance() {
        return singleTon;
    }
}
