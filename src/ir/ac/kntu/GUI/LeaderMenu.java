package ir.ac.kntu.GUI;

import ir.ac.kntu.Leader;
import ir.ac.kntu.MyDate;
import javafx.beans.property.ReadOnlyStringWrapper;
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

        TableColumn<Leader , String> isMarriedColumn = new TableColumn<>("Marriage Status");
        isMarriedColumn.setMinWidth(80);
        isMarriedColumn.setCellValueFactory(cellData -> {
            if(cellData.getValue().isWorking()){
                return new ReadOnlyStringWrapper("Yes");
            }else{
                return new ReadOnlyStringWrapper("No");
            }

        });;

        TableColumn<Leader , String> isWorkingColumn = new TableColumn<>("Working Status");
        isWorkingColumn.setMinWidth(80);
        isWorkingColumn.setCellValueFactory(cellData -> {
            if(cellData.getValue().isWorking()){
                return new ReadOnlyStringWrapper("Yes");
            }else{
                return new ReadOnlyStringWrapper("No");
            }

        });;

        TableColumn<Leader, ArrayList> knownCitiesColumn = new TableColumn<>("KnownCities");
        knownCitiesColumn.setMinWidth(80);
        knownCitiesColumn.setCellValueFactory(new PropertyValueFactory<>("knownCities"));

        table.setItems(leadersObs);
        table.getColumns().addAll(firstNameColumn,lastNameColumn,nationalCodeColumn
                ,identifyCodeColumn,birthColumn,dateOfHireColumn,knownCitiesColumn,
                isMarriedColumn,isWorkingColumn);


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
        Scene scene = new Scene(layout,1000,600);

        window.setScene(scene);
        window.show();


        GridPane gridPane = new GridPane();
        gridPane.setVgap(20);
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


        Label nationalCode = new Label("National Code");
        GridPane.setConstraints(nationalCode,1,3 );

        TextField nationalCodeInput = new TextField();
        GridPane.setConstraints(nationalCodeInput, 2,3 );

        Label identifyCode = new Label("Identify Code");
        GridPane.setConstraints(identifyCode,1,4 );

        TextField identifyCodeInput = new TextField();
        GridPane.setConstraints(identifyCodeInput, 2,4 );

        Label birth = new Label("Birth Date :");
        GridPane.setConstraints(birth,1,5 );
        Label birthYear = new Label("Year:");
        GridPane.setConstraints(birthYear,1,6 );
        TextField birthYearInput = new TextField();
        GridPane.setConstraints(birthYearInput, 2,6 );
        Label birthMonth = new Label("Month:");
        GridPane.setConstraints(birthMonth,3,6 );
        TextField birthMonthInput = new TextField();
        GridPane.setConstraints(birthMonthInput, 4,6 );
        Label birthDay = new Label("Day:");
        GridPane.setConstraints(birthDay,5,6 );
        TextField birthDayInput = new TextField();
        GridPane.setConstraints(birthDayInput, 6,6 );

        Label hire = new Label("Hire Date :");
        GridPane.setConstraints(hire,1,7 );
        Label hireYear = new Label("Year:");
        GridPane.setConstraints(hireYear,1,8 );
        TextField hireYearInput = new TextField();
        GridPane.setConstraints(hireYearInput, 2,8 );
        Label hireMonth = new Label("Month:");
        GridPane.setConstraints(hireMonth,3,8 );
        TextField hireMonthInput = new TextField();
        GridPane.setConstraints(hireMonthInput, 4,8 );
        Label hireDay = new Label("Day:");
        GridPane.setConstraints(hireDay,5,8 );
        TextField hireDayInput = new TextField();
        GridPane.setConstraints(hireDayInput, 6,8 );

        Label knownCities = new Label("Known Cities");
        GridPane.setConstraints(knownCities,1,9 );
        TextField knownCitiesInput = new TextField();
        GridPane.setConstraints(knownCitiesInput, 2,9 );
        Label knownCitiesHint = new Label("Must seperate with SPACE");
        GridPane.setConstraints(knownCitiesHint,3,9 );





        gridPane.getChildren().addAll(firstName,firstNameInput,lastName,lastNameInput,
                nationalCode,nationalCodeInput,identifyCode,identifyCodeInput,
                birth,birthYear,birthYearInput,birthMonth,birthMonthInput,
                birthDay,birthDayInput,hire,hireYear,hireYearInput,
                hireMonth,hireMonthInput,hireDay,hireDayInput,knownCities,knownCitiesInput,
                knownCitiesHint);

        Scene addLeaderScene = new Scene(addLeaderBorder,1000,600);

        addLeader.setOnAction(e -> window.setScene(addLeaderScene));



    }
}

