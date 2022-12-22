package com.library.admin;

import com.library.MainController;
import com.library.alerts.Alerts;
import com.library.passwordEncription.PasswordEncription;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.Window;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.*;


public class AdminLoginController {
    @FXML private TextField username;
    @FXML private PasswordField pass;
    @FXML private Button loginAdmin;
    @FXML private Button register;

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

    // On button click admin goes to admin registration stage
    public void switchToRegister(ActionEvent event) throws IOException {
        // Load new scene
        FXMLLoader fxmlLoader = new FXMLLoader(MainController.class.getResource("resources/RegisterAdmin.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        // Get next controller to remember where to go back
        AdminRegisterController controller = fxmlLoader.getController();
        controller.setPreScene(register.getScene());

        // Set and show scene on button press
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void switchToAdminDashboard() throws IOException {
        // Load new scene
        FXMLLoader fxmlLoader = new FXMLLoader(MainController.class.getResource("resources/AdminDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        // Get next controller to remember where to go back
        AdminRegisterController controller = fxmlLoader.getController();
        controller.setPreScene(register.getScene());

        // Set and show scene on button press
        Stage stage = (Stage) loginAdmin.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void loginAction() throws NoSuchAlgorithmException, IOException {
        // Get owner of a window on register button pressed to pop error
        Window owner = loginAdmin.getScene().getWindow();

        // Error pop up
        if (username.getText().isEmpty() && pass.getText().isEmpty()) {
            Alerts.showAlert(Alert.AlertType.ERROR, owner,
                    "Please enter your username and password");
            return;
        }

        if (username.getText().isEmpty()) {
            Alerts.showAlert(Alert.AlertType.ERROR, owner,
                    "Please enter your username");
            return;
        }
        if (pass.getText().isEmpty()) {
            Alerts.showAlert(Alert.AlertType.ERROR, owner,
                    "Please enter a password");
            return;
        }

        // Get text input to check with database
        String user = username.getText();
        String password = pass.getText();


        boolean flag = validate(user, PasswordEncription.encryptString(password));
        if (!flag) {
            Alerts.infoBox("Please enter correct Username and Password", null, "Failed");
        } else {
            Alerts.infoBox("Login Successful!", null, "Success");
            switchToAdminDashboard();
        }
    }

    public boolean validate(String username, String password){
        // Database connection credentials
        String DATABASE_URL = "jdbc:mysql://localhost/books_library";
        String DATABASE_USERNAME = "root";
        String DATABASE_PASSWORD = "root";
        String SELECT_QUERY = "SELECT * FROM admin WHERE user_name = ? and password = ?";

        // Step 1: Establishing a Connection and
        // try-with-resource statement will auto close the connection.
        try (Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_QUERY)) {
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return true;
            }
        } catch (SQLException e) {
            // print SQL exception information
            Alerts.printSQLException(e);
        }
        return false;
    }
}
