package emp2;

import java.util.List;
import java.util.Scanner;

public class EmpMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean run = true;

        EmpConsoleUtil util = new EmpConsoleUtil();
        EmpService service = new EmpService(new EmpDAO());

        while (run) {
            System.out.println("=======================");
            System.out.println("1. 사원 정보 입력");
            System.out.println("2. 특정 사원 조회");
            System.out.println("3. 전체 사원 조회");
            System.out.println("4. 사원 정보 수정");
            System.out.println("5. 사원 정보 삭제");
            System.out.println("6. 프로그램 종료");
            System.out.println("=======================");
            System.out.println();
            System.out.print("메뉴 번호 입력 >> ");
            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:
                    EmpDTO dto = util.insertEmp(sc);
                    boolean result = service.addEmp(dto);
                    System.out.println(result ? "입력성공" : "입력실패");
                    break;
                case 2:
                    int empNo = util.getEmpNo(sc);
                    dto = service.getRow(empNo);
                    util.printEmp(dto);
                    break;
                case 3:
                    List<EmpDTO> list = service.getList();
                    util.printEmpList(list);
                    break;
                case 4:
                    dto = util.updateInfo(sc);
                    result = service.updateEmpInfo(dto);
                    // System.out.println(result ? "수정완료" : "수정실패");
                    if (result) {
                        // 수정한 사원의 정보 출력
                        dto = service.getRow(dto.getEmpNo());
                        util.printEmp(dto);
                    } else {
                        System.out.println("수정 실패");
                    }
                    break;
                case 5:
                    int deleteEmpNo = util.deleteEmpNo(sc);
                    System.out.println(service.deleteEmpInfo(deleteEmpNo) ? "삭제성공" : "삭제실패");
                    // dto = service.getRow(deleteEmpNo);
                    // if (service.deleteEmpInfo(deleteEmpNo)) {
                    // System.out.println("사번 : " + dto.getEmpNo() + ", " + dto.geteName() + " 사원의
                    // 정보가 삭제되었습니다.");
                    // dto = null;
                    // }
                    break;
                case 6:
                    run = false;
                    break;
                default:
                    System.out.println("메뉴 번호를 확인해주세요");
                    break;
            }
        }
    }
}
