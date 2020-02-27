package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class PrzywitanieController
{
    @FXML
    private Label label;

    @FXML
    private TextField textField;




    @FXML
    public void powitaj()
    {
        String imie = textField.getText();
        label.setText("Cześć " + imie);
    }
}
