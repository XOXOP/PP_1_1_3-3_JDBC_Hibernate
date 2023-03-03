package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public  class Util {
    private Util(){ };
    private static  Connection connection= null;
    private static final String UserName = "root";
    private static final String password = "harakiri681";
    private static final String connectionUrl = "jdbc:mysql://localhost:3306/new_schema_hdbc?serverTimezone=Europe/Moscow&useSSL=false";

    public static Connection getConnection() {


        try {Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(connectionUrl, UserName, password);
            System.out.println("conect is given");
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        return connection;
    }
}
