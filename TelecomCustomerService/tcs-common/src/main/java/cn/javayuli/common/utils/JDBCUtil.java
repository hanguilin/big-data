package cn.javayuli.common.utils;


import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author hanguilin
 * JDBC工具类
 */
public class JDBCUtil {

    private static final String MYSQL_DRIVER_CLASS = "com.mysql.jdbc.Driver";
    private static final String MYSQL_URL = "jdbc:mysql://192.168.1.39:3306/telecom?useUnicode=true&characterEncoding=UTF-8";
    private static final String MYSQL_USERNAME = "root";
    private static final String MYSQL_PASSWORD = "root";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName(MYSQL_DRIVER_CLASS);
            conn = DriverManager.getConnection(MYSQL_URL, MYSQL_USERNAME, MYSQL_PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return conn;

    }
}
