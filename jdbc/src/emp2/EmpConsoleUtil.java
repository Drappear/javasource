package emp2;

import java.util.List;
import java.util.Scanner;

public class EmpConsoleUtil {
    EmpDTO dto = new EmpDTO();

    public EmpDTO insertEmp(Scanner sc) {
        System.out.println("============== 데이터 입력 ==============");
        // System.out.print("사번 : ");
        // int empNo = Integer.parseInt(sc.nextLine());
        // System.out.print("이름 : ");
        // String eName = sc.nextLine();
        // System.out.print("직무 : ");
        // String job = sc.nextLine();
        // System.out.print("매니저 번호 : ");
        // int mgr = Integer.parseInt(sc.nextLine());
        // System.out.print("입사일(YYYY-MM-DD) : ");
        // String hireDate = sc.nextLine();
        // System.out.print("급여 : ");
        // int sal = Integer.parseInt(sc.nextLine());
        // System.out.print("수당 : ");
        // int comm = Integer.parseInt(sc.nextLine());
        // System.out.print("부서번호 : ");
        // int deptNo = Integer.parseInt(sc.nextLine());

        // return new EmpDTO(empNo, eName, job, mgr, hireDate, sal, comm, deptNo);

        System.out.print("사번 : ");
        dto.setEmpNo(Integer.parseInt(sc.nextLine()));

        System.out.print("이름 : ");
        dto.seteName(sc.nextLine());

        System.out.print("직무 : ");
        dto.setJob(sc.nextLine());

        System.out.print("매니저 번호 : ");
        dto.setMgr(Integer.parseInt(sc.nextLine()));

        System.out.print("입사일(YYYY-MM-DD) : ");
        dto.setHireDate(sc.nextLine());

        System.out.print("급여 : ");
        dto.setSal(Integer.parseInt(sc.nextLine()));

        System.out.print("수당 : ");
        dto.setComm(Integer.parseInt(sc.nextLine()));

        System.out.print("부서번호 : ");
        dto.setDeptNo(Integer.parseInt(sc.nextLine()));

        return dto;
    }

    public int getEmpNo(Scanner sc) {
        System.out.print("사번 입력 >> ");
        int empNo = Integer.parseInt(sc.nextLine());
        return empNo;
    }

    public void printEmp(EmpDTO dto) {
        // DTO 출력
        // 사원명
        // ============
        // 사번, 직무, 입사일, 급여, 부서번호
        System.out.println(dto.geteName() + " 사원");
        System.out.println("=======================");
        System.out.println("사번 : " + dto.getEmpNo());
        System.out.println("직무 : " + dto.getJob());
        System.out.println("입사일 : " + dto.getHireDate());
        System.out.println("급여 : " + dto.getSal());
        System.out.println("수당 : " + dto.getComm());
        System.out.println("부서번호 : " + dto.getDeptNo());
        System.out.println();
    }

    public void printEmpList(List<EmpDTO> list) {
        System.out.println("==============================================================================");
        System.out.println("EMPNO   ENAME   JOB     MGR        HIREDATE             SAL    COMM    DEPTNO");
        System.out.println("==============================================================================");
        for (EmpDTO dto : list) {
            System.out.print(dto.getEmpNo() + "\t");
            System.out.print(dto.geteName() + "\t");
            System.out.print(dto.getJob() + "\t");
            System.out.print(dto.getMgr() + "\t");
            System.out.print(dto.getHireDate() + "\t");
            System.out.print(dto.getSal() + "\t");
            System.out.print(dto.getComm() + "\t");
            System.out.println(dto.getDeptNo());
        }
    }

    public EmpDTO updateInfo(Scanner sc) {
        EmpDTO dto = new EmpDTO();
        System.out.println("============= 사원 정보 수정 =============");
        System.out.print("변경할 사원 번호를 입력하세요 >> ");
        dto.setEmpNo(Integer.parseInt(sc.nextLine()));
        System.out.print("변경할 급여 액수를 입력하세요 >> ");
        dto.setSal(Integer.parseInt(sc.nextLine()));
        System.out.print("변경할 추가 수당을 입력하세요 >> ");
        dto.setComm(Integer.parseInt(sc.nextLine()));

        return dto;
    }

    public int deleteEmpNo(Scanner sc) {
        System.out.println("============= 사원 정보 삭제 =============");
        System.out.print("삭제할 사원 번호를 입력하세요 >> ");
        int empNo = Integer.parseInt(sc.nextLine());
        return empNo;
    }
}
