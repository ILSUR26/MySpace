package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    public static Connection getConnect() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost?autoReconnect=true&useSSL=false", "ILSUR26", "F7atx538ilsur");
    }
}
