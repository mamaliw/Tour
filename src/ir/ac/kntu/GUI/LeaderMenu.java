package ir.ac.kntu.GUI;

import ir.ac.kntu.Leader;
import ir.ac.kntu.MyDate;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class LeaderMenu{

    public static void display() throws IOException {

        Stage window = new Stage();
        Button addLeader,removeLeader,editLeader,searchLeaders;

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

        TableColumn<Leader , Integer> identifyCodeColumn = new TableColumn<>("IdentifyCode");
        identifyCodeColumn.setMinWidth(80);
        identifyCodeColumn.setCellValueFactory(new PropertyValueFactory<>("identifyCode"));

        TableColumn<Leader , MyDate> birthColumn = new TableColumn<>("Birth");
        birthColumn.setMinWidth(80);
        birthColumn.setCellValueFactory(new PropertyValueFactory<>("birth"));

        TableColumn<Leader , MyDate> dateOfHireColumn = new TableColumn<>("Hire Date");
        dateOfHireColumn.setMinWidth(80);
        dateOfHireColumn.setCellValueFactory(new PropertyValueFactory<>("dateOfHire"));

        TableColumn<Leader, ArrayList> knownCitiesColumn = new TableColumn<>("KnownCities");
        knownCitiesColumn.setMinWidth(80);
        knownCitiesColumn.setCellValueFactory(new PropertyValueFactory<>("knownCities"));

        table.setItems(leadersObs);
        table.getColumns().addAll(firstNameColumn,lastNameColumn,nationalCodeColumn
                ,identifyCodeColumn,birthColumn,dateOfHireColumn,knownCitiesColumn);


        addLeader = new Button("Add Leader");
        removeLeader = new Button("Remove Leader");
        editLeader = new Button("Edit Leader");
        searchLeaders = new Button("Search Leaders");

        HBox layout2 = new HBox(10);
        layout2.getChildren().addAll(addLeader,removeLeader,editLeader,searchLeaders);
        layout2.setAlignment(Pos.CENTER);
        BorderPane layout = new BorderPane();
        layout.setBottom(layout2);
        layout.setCenter(table);
        Scene scene = new Scene(layout,600,600);

        window.setScene(scene);
        window.show();


        GridPane gridPane = new GridPane();
        gridPane.setVgap(10);
        gridPane.setHgap(20);
        gridPane.setPadding(new Insets(40,40,40,40));

        BorderPane addLeaderBorder = new BorderPane();
        addLeaderBorder.setCenter(gridPane);

        Label addLeaderLabel = new Label("Add Leader");
        addLeaderBorder.setTop(addLeaderLabel);
        BorderPane.setAlignment(addLeaderLabel, Pos.CENTER);

        Label firstName = new Label("First Name");
        GridPane.setConstraints(firstName,1,1 );

        TextField firstNameInput = new TextField();
        GridPane.setConstraints(firstNameInput, 2,1 );

        Label lastName = new Label("Last Name");
        GridPane.setConstraints(lastName, 1, 2);

        TextField lastNameInput = new TextField();
        GridPane.setConstraints(lastNameInput, 2, 2);

        gridPane.getChildren().addAll(firstName,firstNameInput,lastName,lastNameInput);

        Scene addLeaderScene = new Scene(addLeaderBorder,600,600);

        addLeader.setOnAction(e -> window.setScene(addLeaderScene));



    }
}

