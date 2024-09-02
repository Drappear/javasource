package api;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEx3 {
    public static void main(String[] args) {
        // 배열 => 리스트 변환
        // Arrays : 배열을 다루는데 유용한 메소드 정의
        String fruit[] = { "사과", "포도", "멜론", "수박", "참외", "바나나" };

        List<String> list = Arrays.asList(fruit);

        System.out.println(list.get(2));
        System.out.println(list);

        // 배열을 리스트로 변환시 리스트 추가 작업은 안됨
        // list.add("딸기"); // java.lang.UnsupportedOperationException

        List<String> list2 = new ArrayList<>(Arrays.asList(fruit));
        list2.add("딸기");
        System.out.println(list2);

        // List => 배열 변환
        Object[] arr = list2.toArray();
        System.out.println(Arrays.toString(arr));

    }
}
