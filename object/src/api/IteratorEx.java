package api;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("사과");
        list.add("배");
        list.add("수박");
        list.add("복숭아");
        list.add("포도");
        list.add("사과");

        // list 요소 접근
        // 방법1
        for (int i = 0; i < list.size(); i++) {
            String data = list.get(i);
            // 출력 or 그 외 작업
        }

        // 방법2
        for (String data : list) {

        }

        // 방법3
        // Iterator
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            String data = iter.next();
        }

        // =============================================
        Set<String> set = new HashSet<>();
        set.add("사과");
        set.add("복숭아");
        set.add("수박");
        set.add("포도");
        set.add("배");

        // set 요소 접근
        // fori x
        for (String data : set) {

        }

        iter = set.iterator();
        while (iter.hasNext()) {
            String data = iter.next();
        }
    }
}
