package DAO;

import java.sql.*;

public class KetNoiDAO {
    public static Connection getKetNoiDAO() {
         Connection conn=null;
        try {
            String url = "jdbc:sqlserver://localhost:1433;databasename=Do_An";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(url, "sa", "hungtamdiem99");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

}
