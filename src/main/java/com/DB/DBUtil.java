//package com.DB;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class DBUtil {
//
//    private static final String URL = "jdbc:mysql://127.0.0.1:3306/markingsystem?useUnicode=true&characterEncoding=utf-8";
//    private static final String userName = "root";
//    private static final String password = "zhang1997LOVE";
//
//    private static Connection conn = null;
//
//    static {
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            conn = DriverManager.getConnection(URL, userName, password);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static Connection getConn() {
//        return conn;
//    }
//
//}
