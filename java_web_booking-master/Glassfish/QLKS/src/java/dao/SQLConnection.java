package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class SQLConnection {

    public static Connection getConnection() {
        Connection con = null;
        try {
            System.out.println("duong viet hung");
                  
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QuanLyKhachSanDb;user=sa;password=1234");
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }

}
