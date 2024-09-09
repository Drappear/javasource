package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import oracle.net.aso.j;

public class SelectEx4 {
    public static void main(String[] args) {
        // SelectEx => try with resources 형태로 변경

        // 2. 연결 문자열 작성
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "scott";
        String password = "TIGER";

        Scanner sc = new Scanner(System.in);
        System.out.print("조회할 JOB 입력 : ");
        String job = sc.nextLine();
        System.out.print("조회할 EMPNO 입력 : ");
        int empno = sc.nextInt();

        // String sql = "SELECT * FROM EMP WHERE EMPNO =" + empno;
        String sql = "SELECT * FROM EMP WHERE EMPNO = ? OR JOB = ?";

        try (Connection con = DriverManager.getConnection(url, user, password);
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            // 1. 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");

            // ? 처리
            pstmt.setInt(1, empno);
            pstmt.setString(2, job);

            ResultSet rs = pstmt.executeQuery();

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
