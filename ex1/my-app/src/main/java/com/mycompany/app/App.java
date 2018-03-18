package com.mycompany.app;

import java.sql.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        System.out.println("Hello World!");
        Class.forName("org.h2.Driver").newInstance();
        Connection c = DriverManager.getConnection("jdbc:h2:file:C:\\java\\learn\\HA\\ex1\\db\\db2", "sa", "");
        //Connection c = DriverManager.getConnection("jdbc:ha-jdbc:h2cluster", "sa", "");

        PreparedStatement ps = c.prepareStatement("select * from world_city");
        ps.execute();

        ResultSet rs = ps.getResultSet();
        while (rs.next()) {
            System.out.println(rs.getString("Name") + " " + rs.getString("Population"));
        }

        rs.close();
        ps.close();
        c.close();
    }


}
