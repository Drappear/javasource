package api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEx2 {
    public static void main(String[] args) {
        // 1~45 임의의 숫자를 6개 추출후 Set에 담기
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 6; i++) {
            set.add((int) ((Math.random() * 45) + 1));
        }
        System.out.println(set);

        // 정렬이 구현돼있지 않음
        // set.sort() X
        // Collections.sort() X

        // Set => List 변환
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        System.out.println(list);

    }
}
