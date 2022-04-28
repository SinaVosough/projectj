package com.example.termtwo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class signup {
    @FXML
    TextField spusernameID;
    @FXML
    TextField sppasswordID;
    @FXML
    TextField spnationalcodeID;
    @FXML
    TextField spmoneyID;
    @FXML
    Button SPsignupbuttonID;
    @FXML
    Button spclearbuttonID;


    public void spclearbuttonAction(ActionEvent clickEvent)
    {
        spusernameID.clear();
        sppasswordID.clear();
        spnationalcodeID.clear();
        spmoneyID.clear();

    }
    public void SPsignupbuttonAction(ActionEvent clickEvent)
    {
        spmoneyID.clear();

    }
}
