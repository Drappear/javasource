package api;

import java.util.Arrays;

public class StringEx {
    public static void main(String[] args) {

        // 변경 불가능한(immutable) 클래스 : 한번 생성된 인스턴스는 읽기만 가능한 상태
        // java.lang.String
        String str = "a";
        str = str + "bcd"; // 기존 str 삭제하고 다시 인스턴스 생성 후 연결함
        String str5 = "fg";
        str = str + str5; // 기존 str 삭제하고 다시 인스턴스 생성 후 연결함

        // 문자열 변경 가능
        // java.lang.StringBuilder
        // java.lang.StringBuffer

        // 문자열 리터럴 지정 : 저장이 된 후 동일한 문자열이 들어오는 경우에는 한번만 저장
        String str1 = "abc";
        String str4 = "abc";

        String str2 = new String("abc");

        char ch[] = { 'a', 'b', 'c' };
        String str3 = new String(ch);

        // new 로 선언하는 경우 따로 저장됨
        System.out.println(str1 == str4); // true
        System.out.println(str1 == str2); // false

        // 1. 문자열 비교 : equals() / equalsIgnoreCase() : 대소문자 구분없이 비교
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str4));
        System.out.println(str1.equalsIgnoreCase(str4));

        // 2. charAt(int index)
        System.out.println("\n" + "charAt(1) : " + str1.charAt(1));

        str1 = new String("Hello java");

        // 3. length()
        System.out.println("\n" + "str1 길이 : " + str1.length());

        // str1 ==> char 배열로 변환
        char strs[] = new char[str1.length()];
        for (int i = 0; i < str1.length(); i++) {
            strs[i] = str1.charAt(i);
        }
        System.out.println(Arrays.toString(strs));

        // 4. toCharArray()
        char strs1[] = str1.toCharArray();
        System.out.println("\n" + Arrays.toString(strs1));

        // 5. indexOf(찾을문자) : 주어진 문자의 시작위치 리턴 / 못찾으면 -1, // index는 0부터 시작
        System.out.println("\n" + "indexOf(e) : " + str1.indexOf("e"));
        System.out.println("indexOf(java) : " + str1.indexOf("java"));
        System.out.println("indexOf(b) : " + str1.indexOf("b"));
        System.out.println("indexOf(e) : " + str1.indexOf("e"));
        // indexOf(찾을문자, 시작위치)
        System.out.println("indexOf(e) : " + str1.indexOf("e", 4));

        // 6 lastIndexOf()
        System.out.println("\n" + "lastIndexOf(e) : " + str1.lastIndexOf("e"));
        System.out.println("lastIndexOf(java) : " + str1.lastIndexOf("java"));

        // 7. contains(문자열) : 문자열이 포함되어 있는지 확인 후 true/false
        System.out.println("\n" + "contains(e) : " + str1.contains("e"));
        System.out.println("contains(f) : " + str1.contains("f"));

        // 8. startsWith() / endsWith()
        str2 = "java.lang.String";
        System.out.println("\n" + "startsWith(java) : " + str2.startsWith("java"));
        System.out.println("startsWith(lang) : " + str2.startsWith("lang"));
        str3 = "file.txt";
        System.out.println("endsWith(txt) : " + str3.endsWith("txt"));

        // 9. concat(문자열) : 문자열 뒤로 연결
        System.out.println("\n" + "str1.concat(str2) : " + str1.concat(str2));

        // 10. replace() : 새로운 문자열로 리턴
        str1 = "Hello Hello";
        System.out.println("\n" + str1.replace("ll", "LL")); // HeLLo HeLLo
        System.out.println(str1.replaceAll("ll", "LL")); // HeLLo HeLLo
        System.out.println(str1.replaceFirst("ll", "LL")); // HeLLo Hello
        System.out.println(str1);

        // 11. split("패턴 or 분리기호") : 문자열을 분리자로 나누어 문자 배열로 리턴
        System.out.println();
        String animals = "cat,dog,bear";
        String[] arr = animals.split(",");
        for (String string : arr) {
            System.out.println(string);
        }
        arr = animals.split(",", 2);
        for (String string : arr) {
            System.out.println(string);
        }

        // 12. substring(시작위치) : 시작 위치부터 끝까지 잘라내기
        // substring(시작위치, 끝위치) : 시작위치 포함, 끝 위치의 문자는 포함되지 않음
        str1 = "java.lang.Object";
        System.out.println("\n" + "substring(시작위치) : " + str1.substring(10));
        System.out.println("substring(시작위치) : " + str1.substring(5, 9));

        // 13. toUpperCase() / toLowerCase() : 대문자 / 소문자로 변환
        System.out.println("\n" + "toUpperCase() : " + str1.toUpperCase());
        System.out.println("toLowerCase() : " + str1.toLowerCase());

        // 14. trim() : 양쪽 공백제거
        str1 = "              Hello           World     ";
        System.out.println("\n" + str1);
        System.out.println(str1.trim());

        // 15. valueOf()
        System.out.println("\n" + "String.valueOf(0) : " + String.valueOf(0)); // 0 => "0"
        System.out.println("String.valueOf(true) : " + String.valueOf(true)); // true => "true"
        System.out.println("String.valueOf(10.5) : " + String.valueOf(10.5)); // 10.5 => "10.5"

        int i = 100;
        String newStr = String.valueOf(i); // 성능은 valueOf() 지만 + ""; 를 많이 사용
        newStr = i + "";

        // Integer.parseInt("33");
        // String을 기본형 값으로 변환
        int j = Integer.parseInt(newStr);
        System.out.println("\n" + "j = " + j);

        // NumberFormatException
        // j = Integer.parseInt("33.5");
        // System.out.println("j = " + j);
        double d = Double.parseDouble("33.5");
        System.out.println("d = " + d);

        // "true" ==> true
        boolean b = Boolean.parseBoolean("true");
        System.out.println("b = " + b);

        // int(기본타입) => Integer(참조타입)
        // float => Float / boolean => Boolean / double => Double / char => Character
        float f1 = 3.14f;
        Float f2 = 3.14f;

        str1 = "Hello World";
        System.out.println();
        // 거꾸로 출력
        for (int k = str1.length() - 1; k >= 0; k--) {
            System.out.print(str1.charAt(k));
        }
        // StringBuffer 의 reverse() 이용
        StringBuffer sb = new StringBuffer(str1);
        System.out.println("\n" + sb.reverse());
    }
}
