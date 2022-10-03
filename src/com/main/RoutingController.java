package com.main;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class RoutingController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void  switchToAdmin(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("resources/LoginAdmin.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

//    public void  switchToUser(ActionEvent event) throws IOException {
//        Parent root = FXMLLoader.load(getClass().getResource("LoginUser.fxml"));
//        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stage.show();
//    }

//    public void pressButton(ActionEvent event){
//        Admin admin = new Admin();
//        admin.adminRegister();
//        System.out.println("veikia!");
//    }
}
