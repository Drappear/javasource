package api;

import java.util.Arrays;
import java.util.List;

public class ArraysEx {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 4 };

        System.out.println(arr);
        System.out.println(Arrays.toString(arr));

        // copy
        // 1) for
        // int[] arr2 = new int[5];
        // 2) Arrays
        // 3) System

        int[] arr2 = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(arr2));

        // int[] destArr = new int[5];
        // System.arraycopy(arr, 0, destArr, 0, arr.length);

        // 정렬
        int arr3[] = { 3, 2, 0, 1, 4 };
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));

        // 검색 : Arrays.binarySearch(배열명, 찾을값) => 찾을 값의 index 리턴
        // 이진 검색 : 검색 중 가장 빠른 방법(정렬된것을 기본으로)
        // 순차 검색
        int arr4[] = { 3, 2, 0, 1, 4 };
        Arrays.sort(arr4);
        System.out.println(Arrays.binarySearch(arr4, 1));

        // 배열 요소 비교
        System.out.println(Arrays.equals(arr3, arr4));

        // 2차원 배열
        String[][] str2D = { { "aaa", "bbb" }, { "ccc", "ddd" } };
        String[][] str2D2 = { { "aaa", "bbb" }, { "ccc", "ddd" } };
        System.out.println(str2D);
        // System.out.println(Arrays.toString(str2D)); // 2차원 배열에서 사용 불가
        System.out.println(Arrays.deepToString(str2D));
        // System.out.println(Arrays.equals(str2D, str2D2)); // 2차원 배열 사용 불가
        System.out.println(Arrays.deepEquals(str2D, str2D2));

        char[] chArr = { 'A', 'B', 'C', 'D', 'E' };
        System.out.println(chArr);
        System.out.println(Arrays.toString(chArr));
        // 'B' 찾기
        System.out.println(Arrays.binarySearch(chArr, 'B'));
        // 정렬
        Arrays.sort(chArr);
        System.out.println(Arrays.toString(chArr));
        System.out.println(Arrays.binarySearch(chArr, 'B'));

        // 배열 => List 변환
        List<int[]> list = Arrays.asList(arr3);

    }
}
