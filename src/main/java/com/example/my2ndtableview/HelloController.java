package com.example.my2ndtableview;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class HelloController {


    @FXML
    private Label welcomeText;

    public TableView<RollerCoasterData> myTableView;
    public <RollerCoasterData> void initialize() {


        RollerCoasterData coaster1 = new RollerCoasterData("Millienum Force","Cedar Point",93);
        RollerCoasterData coaster2 = new RollerCoasterData("Goliath","SixFlags MM", 85);
        RollerCoasterData coaster3 = new RollerCoasterData("Titan","SixFlags OT",85);

        myTableView.getItems().add(coaster1);

        myTableView.getItems().add(coaster2);

        myTableView.getItems().add(coaster3);



    }
//dsdsdssdsds
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