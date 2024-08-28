package member;

import java.util.Scanner;

public class MemberConsoleUtil {

    public Member addMember(Scanner sc) {
        // 회원 한명에 대한 정보 입력받기
        // Member instance 생성 후 리턴
        Member member = new Member();

        System.out.print("아이디를 입력해주세요. >>");
        member.setId(sc.nextLine());

        System.out.print("이름을 입력해주세요. >>");
        member.setName(sc.nextLine());

        System.out.print("주소를 입력해주세요. >>");
        member.setAddress(sc.nextLine());

        System.out.print("이메일을 입력해주세요. >>");
        member.setEmail(sc.nextLine());

        return member;
    }

    public void printMembers(Member[] members) {
        System.out.println("========================== 회원 목록 =========================");
        System.out.println("    ID     |    이름    |       주소       |     이메일      ");
        System.out.println("==============================================================");
        for (Member member : members) {
            if (member != null) {
                // System.out.println(member.toString());
                System.out.printf("%5s\t%5s\t\t%6s\t\t%10s\n", member.getId(), member.getName(), member.getAddress(),
                        member.getEmail());
            }
        }
    }

    public Member updateMember(Scanner sc, Member[] members) {
        // 주소 수정
        // 아이디, 수정할 주소 입력받기
        System.out.print("아이디를 입력해주세요. >> ");
        String id = sc.nextLine();

        // members에서 일치하는 아이디 찾은 후 주소 변경
        for (Member member : members) {
            if (member != null) {
                if (id.equals(member.getId())) {
                    System.out.print("변경할 주소를 입력해주세요. >> ");
                    member.setAddress(sc.nextLine());

                    // 수정된 member 리턴
                    return member;
                }
            }
        }

        return null;
    }

    public void removeMember(Scanner sc, Member[] members) {
        // 삭제할 회원 아이디 입력
        System.out.print("삭제할 회원 아이디를 입력해주세요. >> ");
        String id = sc.nextLine();

        for (int i = 0; i < members.length; i++) {
            if (members[i] != null) {
                if (id.equals(members[i].getId())) {
                    members[i] = null;
                    System.out.println("아이디가 삭제되었습니다.");
                    return;
                }
            }

        }
    }

}
