package exception;

public class ExceptionEx3 {
    public static void main(String[] args) {
        // method1();

        // 컴파일 예외
        try {
            Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    static void method1() throws Exception {
        method2();
    }

    // method2() 실행시 exception 발생
    // method2에서 처리하지 않고 호출하는 쪽에서 exception 처리
    static void method2() throws Exception {
        throw new Exception();
    }
}
