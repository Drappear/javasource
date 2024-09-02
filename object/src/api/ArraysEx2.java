package api;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysEx2 {
    public static void main(String[] args) {
        String[] strArr = { "cat", "dog", "lion", "tiger" };
        // T, E, K, V : 객체
        Arrays.sort(strArr, Comparator.reverseOrder());

        Integer arr[] = { 33, 21, 43, 56, 13, 32, 87, 67, 44, 90 };
        // Arrays.sort(arr);
        // 내림차순
        Arrays.sort(arr, Comparator.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}
