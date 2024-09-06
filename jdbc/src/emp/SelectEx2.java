package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectEx2 {
    public static void main(String[] args) {

        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null; // select구문 사용시에만 사용

        try {
            // 1. 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");

            // 2. 연결 문자열 작성
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String password = "TIGER";

            // 3. connection 얻기
            con = DriverManager.getConnection(url, user, password);

            // 4. connection을 통해 실행하고자 하는 sql구문 전송
            String sql = "SELECT * FROM EMP";
            pstmt = con.prepareStatement(sql);

            // 5. 전송된 sql구문 실행
            rs = pstmt.executeQuery();

            System.out.println("=======================================================================");
            System.out.println("EMPNO   ENAME   JOB    MGR      HIREDATE    SAL    COMM     DEPTNO");
            System.out.println("=======================================================================");
            // 6. 결과값이 담긴 rs 조회
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
        } finally {
            try {
                rs.close();
                pstmt.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
