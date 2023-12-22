package com.example.my2ndtableview;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;

public class HelloController {
    @FXML
    private Label welcomeText;

    public TableColumn left;
     String name;

    public TableColumn middle;
    String park;

    public TableColumn right;
    Integer speed;



    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}



  //Millennium Force
  //Goliath
  //Titan

  //  Cedar Point
  //  Six Flags Magic Mountain
  //  Six Flags Over Texas

     //93
     //85
    //85