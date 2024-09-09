package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateEx1 {
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
            // 자바에서 auto commit상태인 것을 해제
            con.setAutoCommit(false);

            // 4. update
            // 4-1. 실행할 sql문 작성
            String sql = "UPDATE EMP_TEMP SET COMM = 200 WHERE EMPNO = 7369";
            // 4-2. sql문 전송
            pstmt = con.prepareStatement(sql);
            // 4-3. sql문 실행 후 결과받기
            int result = pstmt.executeUpdate();

            if (result > 0) {
                System.out.println("수정 완료");
                con.commit();
            } else {
                con.rollback();
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
