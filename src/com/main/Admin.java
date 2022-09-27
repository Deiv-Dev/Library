package com.main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Admin {
    Connection c;
    String URL = "jdbc:mysql://localhost/books_library";
    String user = "root";
    String password = "";

    boolean adminRegister() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection(URL, user, password);
            String sql = "INSERT INTO admin (admin_id, user_name, email, password) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = c.prepareStatement(sql);
            statement.setString(1,  "1" );
            statement.setString(2, "Bill");
            statement.setString(3, "Bill@gmail.com");
            statement.setString(4, "new");

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new user was inserted successfully!");
            }

        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
