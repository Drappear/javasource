package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateEx2 {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        Scanner sc = new Scanner(System.in);

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

            System.out.println("================ 사원 정보 수정 ================");
            System.out.print("사번 : ");
            int empNo = Integer.parseInt(sc.nextLine());
            System.out.print("수당 : ");
            int comm = Integer.parseInt(sc.nextLine());

            // 4. update
            // 4-1. 실행할 sql문 작성
            String sql = "UPDATE EMP_TEMP SET COMM = ? WHERE EMPNO = ?";
            // 4-2. sql문 전송
            pstmt = con.prepareStatement(sql);

            // ? 해결
            pstmt.setInt(1, comm);
            pstmt.setInt(2, empNo);

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
