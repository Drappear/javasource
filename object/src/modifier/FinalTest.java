package modifier;

public final class FinalTest {
    // 상수(대문자) 선언
    final int MAX_SIZE = 10;

    final int getMaxSize() {
        // 지역변수 == 상수 와 같은 역할
        final int LV = MAX_SIZE;
        return MAX_SIZE;
    }

    // class A extends FinalTest{} // final class는 상속 불가
}
