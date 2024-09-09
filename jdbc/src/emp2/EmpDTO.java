package emp2;

public class EmpDTO {
    // EMP 테이블의 하나의 행(레코드)을 담을 수 있는 구조로 설계
    // 컬럼명 동일(NUMBER : int or long / VARCHAR2 : String / DATE : java.util.Date)
    private int empNo;
    private String eName;
    private String job;
    private int mgr;
    private String hireDate;
    private int sal;
    private int comm;
    private int deptNo;

    public EmpDTO() {
    }

    public EmpDTO(int empNo, String eName, String job, int mgr, String hireDate, int sal, int comm, int deptNo) {
        this.empNo = empNo;
        this.eName = eName;
        this.job = job;
        this.mgr = mgr;
        this.hireDate = hireDate;
        this.sal = sal;
        this.comm = comm;
        this.deptNo = deptNo;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getMgr() {
        return mgr;
    }

    public void setMgr(int mgr) {
        this.mgr = mgr;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String string) {
        this.hireDate = string;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public int getComm() {
        return comm;
    }

    public void setComm(int comm) {
        this.comm = comm;
    }

    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

}
