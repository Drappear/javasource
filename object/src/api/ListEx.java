package api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        // <객체> : 리스트에 담을 타입
        // 1,2,3,4 => <Integer>, <Double>
        // 10개의 String 을 담는 크기 설정
        List<String> list = new ArrayList<>();

        // add() : 순서대로 추가
        list.add("사과");
        list.add("배");
        list.add("수박");
        list.add("복숭아");
        list.add("포도");
        list.add("사과");

        // add(index, 요소) : index에 추가
        list.add(2, "바나나");

        // 확인
        System.out.println(list);

        System.out.println("크기 : " + list.size());

        // 특정 위치 요소
        System.out.println("특정 위치 요소 가져오기 : " + list.get(3));
        System.out.println("특정 위치 요소 제거 : " + list.remove(3));
        System.out.println(list);
        System.out.println("특정 요소 제거 : " + list.remove("복숭아"));
        System.out.println(list);
        System.out.println("특정 요소 포함 여부 : " + list.contains("포도"));
        System.out.println("특정 요소 위치 : " + list.indexOf("포도"));

        Object[] arr = list.toArray();
        for (Object object : arr) {
            System.out.println(object);
        }

        // java.util.Collections : Collection과 관련된 유용한 메소드 제공
        // Collections.sort(list); // 오름차순
        // list.sort(Comparator.naturalOrder()); // 오름차순
        // list.sort(Comparator.reverseOrder()); // 내림차순
        System.out.println(list);
    }
}
