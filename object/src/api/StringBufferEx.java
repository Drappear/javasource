package api;

public class StringBufferEx {
    public static void main(String[] args) {
        // 변경 가능한(mutable)
        // StringBuffer : 스레드에 안전
        // StringBuilder

        StringBuffer sb1 = new StringBuffer("abc");
        StringBuffer sb2 = new StringBuffer("abc");

        // equals() : Object가 상속해준 방식으로 사용
        System.out.println("sb1.equals(sb2) : " + sb1.equals(sb2)); // false
        System.out.println("sb1 == sb2 : " + (sb1 == sb2)); // false

        // 값 비교 ==> String 으로 변환
        // toString() : StringBuffer => String
        String s1 = sb1.toString();
        String s2 = sb2.toString();
        System.out.println("s1.equals(s2) : " + s1.equals(s2));

        System.out.println("\n" + "append() : " + sb1.append("def"));
        System.out.println("\n" + "insert() : " + sb1.insert(3, "Hello"));
        System.out.println("\n" + "delete() : " + sb1.delete(2, 5));
        System.out.println("\n" + "replace() : " + sb1.replace(3, sb1.length(), "END"));
    }
}
