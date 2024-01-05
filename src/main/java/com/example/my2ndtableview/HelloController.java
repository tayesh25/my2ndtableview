package com.example.my2ndtableview;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;

public class HelloController {
    public TableColumn left;
    public TableColumn middle;
    public TableColumn right;


    @FXML
    public TableView<RollerCoasterData> myTableView;

    public HelloController() throws IOException {
    }


    public void initialize() {

        RollerCoasterData coaster1 = new RollerCoasterData("Millienum Force", "Cedar Point", 93);
        RollerCoasterData coaster2 = new RollerCoasterData("Goliath", "SixFlags MM", 85);
        RollerCoasterData coaster3 = new RollerCoasterData("Titan", "SixFlags OT", 85);

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

    public void Saving() throws Exception {
        FileOutputStream outputStream = new FileOutputStream("Save");
        ObjectOutputStream objOutputStream = new ObjectOutputStream(outputStream);
        ObservableList<RollerCoasterData> activities = myTableView.getItems();
        objOutputStream.writeInt(activities.size());
        for (RollerCoasterData activity : activities) {
            objOutputStream.writeObject(activity);
        }
        objOutputStream.flush();
        objOutputStream.close();
        outputStream.close();
    }
    public void restoreData() throws Exception {

        File fileForData = new File("myTableView");
        FileInputStream inputStream = new FileInputStream(fileForData);
        ObjectInputStream objInputStream = new ObjectInputStream(inputStream);
        inputStream.close();
    }








}



