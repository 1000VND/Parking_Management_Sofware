/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.*;

/**
 *
 * @author Lê Quang Hưng
 */
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
