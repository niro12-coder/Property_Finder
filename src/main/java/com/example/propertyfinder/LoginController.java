package com.example.propertyfinder;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    private Button register;

    @FXML
    void registeracc(MouseEvent event) throws IOException {
        Stage stage =(Stage) register.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Register.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Property Finder");
        stage.setScene(scene);

    }

}
