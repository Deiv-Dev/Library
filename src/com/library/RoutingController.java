package com.library;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;

public class RoutingController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Button Admin;
    @FXML
    private Button User;

    private Scene preScene;
    public RoutingController() {
    }

//    public void switchToAdmi(ActionEvent event) throws IOException {
//        Parent root = FXMLLoader.load(getClass().getResource("resources/LoginAdmin.fxml"));
//        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
//    }

    public void switchToUser(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("resources/LoginUser.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        RoutingController controller = fxmlLoader.getController();
        controller.setPreScene(User.getScene());

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void switchToAdmin(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("resources/LoginAdmin.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        RoutingController controller = fxmlLoader.getController();
        controller.setPreScene(Admin.getScene());
        
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }


    //Sets presence to know where to go back
    public void setPreScene(Scene preScene) {
        this.preScene = preScene;
    }

    //Function to go back to previous scene
    @FXML
    void Back(ActionEvent event) throws IOException {
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(preScene);
        stage.show();
    }











//    public void switchToUser(ActionEvent event) throws IOException {
//        Parent root = FXMLLoader.load(getClass().getResource("resources/LoginUser.fxml"));
//        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
//    }

//    public void Back(ActionEvent event) throws IOException {
//        Parent root = FXMLLoader.load(getClass().getResource("resources/main.fxml"));
//        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
//    }
    

//    public void pressButton(ActionEvent event){
//        Admin admin = new Admin();
//        admin.adminRegister();
//        System.out.println("veikia!");
//    }
}
