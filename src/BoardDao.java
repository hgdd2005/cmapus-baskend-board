import java.sql.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardDao {
    private Connection conn;
    private static final String USERNAME = "hgdd1998";
    private static final String PASSWORD = "12345";
    private static final String URL = "jdbc:mysql//43.200.177.239/board";

    public void BoardDo() {
        try {
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("드라이버 로딩 성공");

        } catch (Exception e) {
            System.out.println("드라이버 로딩 실패");
            try {
                conn.close();
            } catch (SQLException E1) {
            }
        }
    }
}
