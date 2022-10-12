package com.library.admin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;

public class AdminController {

//    //Duomenis prisijungti prie duombazer
//    Connection c;
//    String URL = "jdbc:mysql://localhost/books_library";
//    String user = "root";
//    String password = "";

    // Import preScene to know what is previous scene
    private Scene preScene;

    // Get previous scene to go back on button pressed
    public void setPreScene(Scene preScene) {
        this.preScene = preScene;
    }

    // click on back button to jump back to the previous home scene
    @FXML
    void back(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(preScene);
        stage.show();
    }

//    public boolean adminLogin() {
//        // Bandome ivesti informacija i duombaze
//        try {
//            // Pasiemam paketa prisijungimui prie duombazes
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//            // Prisijungimo informacija priskiriam raidei c
//            c = DriverManager.getConnection(URL, user, password);
//
//            // Ivedame reikalingus duomenis i mysql duombaze
//            String sql = "INSERT INTO admin (admin_id, user_name, email, password) VALUES (?, ?, ?, ?)";
//            PreparedStatement statement = c.prepareStatement(sql);
//            statement.setString(1,  "1" );
//            statement.setString(2, "Bill");
//            statement.setString(3, "Bill@gmail.com");
//            statement.setString(4, "new");
//
//            // Jei ivedimas teisingas isvedame zinute
//            int rowsInserted = statement.executeUpdate();
//            if (rowsInserted > 0) {
//                System.out.println("A new user was inserted successfully!");
//            }
//
//        // Jei informacija nereisinga arba nepina isvedame klaida
//        } catch (SQLException | ClassNotFoundException ex) {
//            ex.printStackTrace();
//        }
//        return false;
//    }
}
