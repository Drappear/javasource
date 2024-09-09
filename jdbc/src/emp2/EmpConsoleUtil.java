package emp2;

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
}
