package api;

import java.util.ArrayList;
import java.util.List;

public class ListEx2 {
    public static void main(String[] args) {
        List<Member> list = new ArrayList<>();

        list.add(new Member("id1", "test1"));
        list.add(new Member("id2", "test2"));
        list.add(new Member("id3", "test3"));
        list.add(new Member("id4", "test4"));

        System.out.println(list);

        System.out.println(list.get(2));
        System.out.println(list.remove(2));
        System.out.println(list);
    }
}
