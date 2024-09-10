package emp2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO {
    // CRUD 작업을 위한 메소드 작성
    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs;

    // static 블록 : 클래스 로드되면 인스턴스 생성 여부와 관계없이 실행
    static {
        // 1. 드라이버 로드
        try {
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() throws SQLException {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "scott";
        String password = "TIGER";

        // con = DriverManager.getConnection(url, user, password);
        // return con;

        return DriverManager.getConnection(url, user, password);
    }

    public void close(Connection con, PreparedStatement pstmt) {
        try {
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
        try {
            rs.close();
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // CRUD 메소드 작성
    public boolean insert(EmpDTO dto) {
        boolean flag = false;
        try {
            con = getConnection();

            String sql = "INSERT INTO EMP_TEMP(EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)";
            sql += " VALUES(?, ?, ?, ?, ?, ?, ?, ?)";

            pstmt = con.prepareStatement(sql);

            pstmt.setInt(1, dto.getEmpNo());
            pstmt.setString(2, dto.geteName());
            pstmt.setString(3, dto.getJob());
            pstmt.setInt(4, dto.getMgr());
            pstmt.setString(5, dto.getHireDate());
            pstmt.setInt(6, dto.getSal());
            pstmt.setInt(7, dto.getComm());
            pstmt.setInt(8, dto.getDeptNo());

            int result = pstmt.executeUpdate();

            if (result > 0) {
                flag = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }
        return flag;
    }

    // 특정 사원 조회
    public EmpDTO getEmp(int empNo) {
        EmpDTO dto = null;
        try {
            con = getConnection();

            String sql = "SELECT * FROM EMP_TEMP WHERE EMPNO = ?";
            pstmt = con.prepareStatement(sql);

            pstmt.setInt(1, empNo);

            rs = pstmt.executeQuery();

            if (rs.next()) {
                dto = new EmpDTO();
                dto.setEmpNo(rs.getInt("EMPNO"));
                dto.seteName(rs.getString("ENAME"));
                dto.setJob(rs.getString("JOB"));
                dto.setMgr(rs.getInt("MGR"));
                dto.setHireDate(rs.getString("HIREDATE"));
                dto.setSal(rs.getInt("SAL"));
                dto.setComm(rs.getInt("COMM"));
                dto.setDeptNo(rs.getInt("DEPTNO"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt, rs);
        }
        return dto;
    }

    // 전체 사원 조회
    public List<EmpDTO> getList() {
        List<EmpDTO> list = new ArrayList<>();
        try {
            con = getConnection();

            String sql = "SELECT * FROM EMP_TEMP";
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                EmpDTO dto = new EmpDTO();
                dto.setEmpNo(rs.getInt("EMPNO"));
                dto.seteName(rs.getString("ENAME"));
                dto.setJob(rs.getString("JOB"));
                dto.setMgr(rs.getInt("MGR"));
                dto.setHireDate(rs.getString("HIREDATE"));
                dto.setSal(rs.getInt("SAL"));
                dto.setComm(rs.getInt("COMM"));
                dto.setDeptNo(rs.getInt("DEPTNO"));

                list.add(dto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt, rs);
        }
        return list;
    }

    // 사원 정보 수정
    public boolean empUpdate(EmpDTO dto) {
        boolean flag = false;
        try {
            con = getConnection();

            String sql = "UPDATE EMP_TEMP SET COMM = ?, SAL = ? WHERE EMPNO = ?";

            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, dto.getComm());
            pstmt.setInt(2, dto.getSal());
            pstmt.setInt(3, dto.getEmpNo());

            int result = pstmt.executeUpdate();
            if (result > 0) {
                flag = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }
        return flag;
    }

    // 사원 정보 삭제
    public boolean empDelete(int empNo) {
        boolean flag = false;
        try {
            con = getConnection();

            String sql = "DELETE FROM EMP_TEMP WHERE EMPNO = ?";

            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, empNo);

            int result = pstmt.executeUpdate();
            if (result > 0) {
                flag = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }
        return flag;
    }

}
