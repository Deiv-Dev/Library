package com.library.user;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class UserController {

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
}
