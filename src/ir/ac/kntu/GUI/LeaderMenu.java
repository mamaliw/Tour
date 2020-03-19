package ir.ac.kntu.GUI;

import ir.ac.kntu.Leader;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LeaderMenu{

    public static void display() throws IOException {
        ObservableList<Leader> leadersObs = FXCollections.observableArrayList(MainMenu.leaders.getLeaders());

        TableView<Leader> table = new TableView<>();

        TableColumn<Leader , String> firstNameColumn = new TableColumn<>("Firstname");
        firstNameColumn.setMinWidth(80);
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));

        TableColumn<Leader , String> lastNameColumn = new TableColumn<>("Lastname");
        lastNameColumn.setMinWidth(80);
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));

        TableColumn<Leader , Integer> nationalCodeColumn = new TableColumn<>("NationalCode");
        nationalCodeColumn.setMinWidth(80);
        nationalCodeColumn.setCellValueFactory(new PropertyValueFactory<>("nationalCode"));

//        TableColumn<Leader , String> firstnameColumn = new TableColumn<>("Firstname");
//        firstnameColumn.setMinWidth(80);
//        firstnameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));
//
//        TableColumn<Leader , String> firstnameColumn = new TableColumn<>("Firstname");
//        firstnameColumn.setMinWidth(80);
//        firstnameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));
//
//        TableColumn<Leader , String> firstnameColumn = new TableColumn<>("Firstname");
//        firstnameColumn.setMinWidth(80);
//        firstnameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));

        table.setItems(leadersObs);
        table.getColumns().addAll(firstNameColumn,lastNameColumn,nationalCodeColumn);


        Stage window = new Stage();
        StackPane layout = new StackPane();
        layout.getChildren().add(table);
        Scene scene = new Scene(layout,600,600);

        window.setScene(scene);
        window.showAndWait();

    }
}

