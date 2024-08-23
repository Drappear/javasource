package array;

import java.util.Arrays;

public class ArrayEx3 {
    public static void main(String[] args) {
        // char 배열 선언, 생성
        // char[] 배열명 = {'a', 'b', 'c','d'};
        // char 배열명[]
        char[] chArr = { 'a', 'b', 'c', 'd' };

        System.out.println(Arrays.toString(chArr));
        for (int i = 0; i < chArr.length; i++) {
            System.out.print(chArr[i] + ", ");
        }

        System.out.println();

        // 향상된 for문
        for (char c : chArr) {
            System.out.print(c + ", ");
        }

        System.out.println();

        // float 배열 선언, 생성
        float[] flArr = { 12.5f, 13.2f, 14.5f, 15.6f };

        for (float f : flArr) {
            System.out.print(f + ", ");
        }

        System.out.println();

        // String 배열 선언, 생성
        String[] strArr = { "A", "B", "C", "D" };
        // System.out.println(strArr[4]); ArrayIndexOutOfBoundsException
        for (String string : strArr) {
            System.out.print(string + ", ");
        }
    }
}
