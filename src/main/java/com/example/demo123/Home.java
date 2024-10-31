package com.example.demo123;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Home
{
    @javafx.fxml.FXML
    private TextArea textAreaFxid;
    @javafx.fxml.FXML
    private TextField textFxid;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void showButtonOnAction(ActionEvent actionEvent) {
        String s=textFxid.getText();
        textAreaFxid.setText(s);
    }
}