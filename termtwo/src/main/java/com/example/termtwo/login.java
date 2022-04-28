package com.example.termtwo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.io.IOException;

public class login {
    @FXML
    TextField LPusernamefieldID;
    @FXML
    PasswordField LPpasswordfieldID;
    @FXML
    Button enterbuttonID;
    @FXML
    Button LPsignupID;

    HelloApplication change=new HelloApplication();

    public void lpenterbuttonAction(ActionEvent clickEvent)
    {
        LPpasswordfieldID.clear();
    }
    public void LPsignupActioN(ActionEvent clickEvent) throws IOException {
        change.signup("sign.fxml");



    }





}