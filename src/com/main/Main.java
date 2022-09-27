package com.main;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        primaryStage.setTitle("Biblioteka");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

//        Group root = new Group();
//        Scene scene = new Scene(root,600,600);
//        Stage stage = new Stage();
//        stage.setResizable(false);
//        stage.setTitle("Biblioteka");
//
//        Text text = new Text();
//        text.setText("Pasirinkite prisijungimo buda");
//        text.setX(50);
//        text.setY(50);
//        text.setFont(Font.font("Verdana",34));
//        text.setFill(Color.LIMEGREEN);
//
//        root.getChildren().add(text);
//        stage.setScene(scene);
//        stage.show();
//        System.out.println("veikia?");
    }

    public static void main(String[] args) {
//        Admin admin = new Admin();
//        Circle1 circle1 = new Circle1();
//        admin.adminRegister();
        launch(args);
    }
}

