package com.example.propertyfinder;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RegisterController implements Initializable {
    @FXML
    private ChoiceBox<String> Gender;

    @FXML
    private ChoiceBox<String> Type;

    @FXML
    private Button Cancel;

    @FXML
    void goBack(MouseEvent event) throws IOException {
        Stage stage =(Stage) Cancel.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Login.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Property Finder");
        stage.setScene(scene);

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Gender.getItems().addAll("Male","Female");
        Type.getItems().addAll("Owner","Client");
    }
}

