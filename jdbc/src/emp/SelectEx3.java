package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectEx3 {
    public static void main(String[] args) {
        // SelectEx => try with resources 형태로 변경

        // 2. 연결 문자열 작성
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "scott";
        String password = "TIGER";

        String sql = "SELECT * FROM EMP";

        try (Connection con = DriverManager.getConnection(url, user, password);
                PreparedStatement pstmt = con.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery()) {
            // 1. 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");

            // 6. 결과값이 담긴 rs 조회
            System.out.println("=======================================================================");
            System.out.println("EMPNO   ENAME   JOB    MGR      HIREDATE    SAL    COMM     DEPTNO");
            System.out.println("=======================================================================");
            while (rs.next()) {
                // number => getInt()
                // varchar2 => getString()
                // date => getDate()
                // 괄호 안에는 컬럼 번호 또는 컬럼명 가능
                System.out.print(rs.getInt(1) + "\t");
                System.out.print(rs.getString(2) + "\t");
                System.out.print(rs.getString(3) + "\t");
                System.out.print(rs.getInt(4) + "\t");
                System.out.print(rs.getDate(5) + "\t");
                System.out.print(rs.getInt(6) + "\t");
                System.out.print(rs.getInt(7) + "\t");
                System.out.println(rs.getInt(8));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
