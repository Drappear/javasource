package member;

import java.util.ArrayList;
import java.util.List;

public class MemberEx1 {
    public static void main(String[] args) {
        List<Member> list = new ArrayList<>();

        list.add(new Member("hong111", "홍길동", "서울", "hong@naver.com"));
        list.add(new Member("hong222", "홍길동", "서울", "hong@naver.com"));
        list.add(new Member("hong333", "홍길동", "서울", "hong@naver.com"));
        list.add(new Member("hong444", "홍길동", "서울", "hong@naver.com"));

        for (Member member : list) {
            System.out.println(member.getId());
            System.out.println(member.getName());
            System.out.println(member.getAddress());
            System.out.println(member.getEmail());
        }
    }

}
