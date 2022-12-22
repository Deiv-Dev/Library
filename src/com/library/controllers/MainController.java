package com.library;

import com.library.controllers.admin.AdminLoginController;
import com.library.controllers.user.UserController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;

public class MainController {

    // click on this button to jump to the next scene
    @FXML private Button admin;
    @FXML private Button user;

    // On button click admin goes to admin stage
    public void switchToAdmin(ActionEvent event) throws IOException {
        // Load new scene
        FXMLLoader fxmlLoader = new FXMLLoader(MainController.class.getResource("resources/LoginAdmin.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        // Get next controller to remember where to go back
        AdminLoginController controller = fxmlLoader.getController();
        controller.setPreScene(admin.getScene());

        // Set and show scene on button press
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // On button click user goes to user stage
    public void switchToUser(ActionEvent event) throws IOException {
        // Load new scene
        FXMLLoader fxmlLoader = new FXMLLoader(MainController.class.getResource("resources/LoginUser.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        // Get next controller to remember where to go back
        UserController controller = fxmlLoader.getController();
        controller.setPreScene(user.getScene());

        // Set and show scene on button press
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
