package cue.edu.co.miniproyecto2.confing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    private static String url = "jdbc:mysql://localhost:3306/proyectocorte2";
    private static String user = "root";
    private static String password = "admin";
    public static Connection getInstance() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

}