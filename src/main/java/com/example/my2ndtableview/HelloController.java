package com.example.my2ndtableview;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class HelloController {
    public TableColumn left;
    public TableColumn middle;
    public TableColumn right;


    @FXML
    public TableView<RollerCoasterData> myTableView;
    public void initialize() {


        RollerCoasterData coaster1 = new RollerCoasterData("Millienum Force","Cedar Point", 93);
        RollerCoasterData coaster2 = new RollerCoasterData("Goliath","SixFlags MM", 85);
        RollerCoasterData coaster3 = new RollerCoasterData("Titan","SixFlags OT", 85);

        myTableView.getItems().add(coaster1);

        myTableView.getItems().add(coaster2);

        myTableView.getItems().add(coaster3);

        left.setCellValueFactory(
                new PropertyValueFactory<>("name"));
        middle.setCellValueFactory(
                new PropertyValueFactory<>("park"));
        right.setCellValueFactory(
                new PropertyValueFactory<>("Speed"));


    }


    String name;
    PropertyValueFactory factory =
            new PropertyValueFactory<>("name");






}

    public void onActionNew() throws Exception {
        String whatTheUserTyped = textField.getText();
        listView.getItems().add(whatTheUserTyped);
        saveData();
    public void saveData() throws Exception {
        File fileForData = new File(".tahseen");
        FileOutputStream outputStream = new FileOutputStream(fileForData);
        ObjectOutputStream objOutputStream = new ObjectOutputStream(outputStream);
        objOutputStream.writeObject(list0.size());
        for (Object imageName : removedImages) {

        }

        objOutputStream.flush();
    }

    public void restoreData() {

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