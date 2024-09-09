package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteEx1 {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            // 1. 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");
            // 2. 연결 문자열
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String password = "TIGER";
            // 3. connection
            con = DriverManager.getConnection(url, user, password);

            // 4. delete
            // 4-1. 실행할 sql문 작성
            String sql = "DELETE FROM EMP_TEMP WHERE EMPNO = 7201";
            // 4-2. sql문 전송
            pstmt = con.prepareStatement(sql);
            // 4-3. sql문 실행 후 결과받기
            int result = pstmt.executeUpdate();
            if (result > 0) {
                System.out.println("삭제 완료");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
